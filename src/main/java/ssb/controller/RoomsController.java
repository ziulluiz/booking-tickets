package ssb.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ssb.entity.MoviesEntity;
import ssb.entity.RoomsEntity;
import ssb.repository.MoviesRepository;
import ssb.repository.RoomsRepository;

import java.util.List;

@Path("/rooms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoomsController {

    @Inject
    RoomsRepository roomsRepository;
    @GET
    @Transactional
    public Response getAllMovies() throws Exception{
        List<RoomsEntity> roomsEntities = roomsRepository.listAll();
        return Response.ok(roomsEntities).build();
    }

    @GET
    @Transactional
    @Path("/{id}")
    public Response getRoom(@PathParam("id") long id){
        return roomsRepository.findByIdOptional(id).map(movie ->
                Response.ok(movie).build()).orElse(Response.status(404).build());
    }

    @POST
    @Transactional
    public Response addRoom(RoomsEntity roomsEntity){
        roomsRepository.persist(roomsEntity);
        if (roomsRepository.isPersistent(roomsEntity)){
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }

    @DELETE
    @Transactional
    @Path("/delete/{id}")
    public Response delete(@PathParam("id") long id) {
        boolean deleted = roomsRepository.deleteById(id);
        return deleted ? Response.noContent().build(): Response.status(404).build();
    }
}

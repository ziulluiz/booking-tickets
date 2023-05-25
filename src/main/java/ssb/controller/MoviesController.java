package ssb.controller;

import io.quarkus.panache.common.Sort;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ssb.entity.MoviesEntity;

import ssb.repository.MoviesRepository;

import java.util.List;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MoviesController {

        @GET
        @Transactional
        public Response getAllMovies() throws Exception{
            List<MoviesEntity> moviesEntities = moviesRepository.listAll();
            return Response.ok(moviesEntities).build();
        }

        @GET
        @Transactional
        @Path("/{id}")
        public Response getMovie(@PathParam("id") long id){
            return moviesRepository.findByIdOptional(id).map(movie ->
                    Response.ok(movie).build()).orElse(Response.status(404).build());

        }

    @Inject
    MoviesRepository moviesRepository;
    @POST
    @Transactional
    public Response addMovie(MoviesEntity moviesEntity){
        moviesRepository.persist(moviesEntity);
        if (moviesRepository.isPersistent(moviesEntity)){
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }

    @DELETE
    @Transactional
    @Path("/delete/{id}")
    public Response delete(@PathParam("id") long id) {
    boolean deleted = moviesRepository.deleteById(id);
        return deleted ? Response.noContent().build(): Response.status(404).build();
}}

package ssb.controller;

import io.quarkus.panache.common.Sort;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import ssb.entity.MoviesEntity;
import ssb.entity.UsersEntity;
import ssb.repository.UsersRepository;

import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersController {

    @GET
    @Transactional
    public Response getAllUsers() throws Exception{
        List<UsersEntity> usersEntities = usersRepository.listAll();
        return Response.ok(usersEntities).build();
    }
    @GET
    @Transactional
    @Path("/{id}")
    public Response getUser(@PathParam("id") long id){
        return usersRepository.findByIdOptional(id).map(
                user -> Response.ok(user).build()).orElse(Response.status(404).build());
    }

    @Inject
    UsersRepository usersRepository;
    @POST
    @Transactional
    public Response addUser(UsersEntity usersEntity){
        usersRepository.persist(usersEntity);
        if (usersRepository.isPersistent(usersEntity)){
            return Response.status(200).build();
        }
        return Response.status(404).build();
    }
    @DELETE
    @Transactional
    @Path("/delete/{user_id}")
    public Response delete(@PathParam("user_id") long user_id) {
        boolean deleted = usersRepository.deleteById(user_id);
        return deleted ? Response.noContent().build(): Response.status(404).build();


    }}

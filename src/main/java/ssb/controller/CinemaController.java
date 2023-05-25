package ssb.controller;

import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ssb.entity.MoviesEntity;
import ssb.entity.UsersEntity;

import java.util.List;

@Path("/getAll/{name}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CinemaController {

    @GET
    @Transactional
    public List<UsersEntity> getAll(String name) throws Exception{
        return UsersEntity.findAll(Sort.descending(name)).list();
    }

}

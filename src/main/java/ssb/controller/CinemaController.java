package ssb.controller;

import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ssb.entity.MoviesEntity;

import java.util.List;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CinemaController {

    @GET
    @Transactional
    public List<MoviesEntity> getAll() throws Exception{
        return MoviesEntity.findAll(Sort.ascending("name")).list();
    }

}

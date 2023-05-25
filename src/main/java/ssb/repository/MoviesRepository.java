package ssb.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import ssb.entity.MoviesEntity;

@ApplicationScoped
public class MoviesRepository implements PanacheRepository <MoviesEntity> {
}

package ssb.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import ssb.entity.RoomsEntity;

@ApplicationScoped
public class RoomsRepository implements PanacheRepository <RoomsEntity> {
}

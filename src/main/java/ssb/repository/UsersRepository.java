package ssb.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import ssb.entity.UsersEntity;

@ApplicationScoped
public class UsersRepository implements PanacheRepository <UsersEntity> {
}

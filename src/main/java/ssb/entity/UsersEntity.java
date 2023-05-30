package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.inject.Inject;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Table(name = "users",schema = "public")
@Entity
@Setter
@Getter
@ToString

public class UsersEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    long user_id;
    @Column(name = "user_name")
    String user_name;

}

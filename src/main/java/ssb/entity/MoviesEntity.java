package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "movies",schema = "public")
@Entity
@Setter
@Getter
@ToString

public class MoviesEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    long movie_id;
    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;

}

package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Table(name = "movies",schema = "public")
@Entity
public class MoviesEntity extends PanacheEntity {

    public MoviesEntity() {
    super();
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    long movie_id;

    @Column(name = "name")
    String name;
    @Column(name = "description")
    String description;

    public long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(long movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MoviesEntity(long movie_id, String name, String description) {
        super();
        this.movie_id = movie_id;
        this.name = name;
        this.description = description;
    }

}

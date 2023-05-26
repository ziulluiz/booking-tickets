package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Set;

@Table(name = "users",schema = "public")
@Entity
public class UsersEntity extends PanacheEntityBase {

    public UsersEntity() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    long user_id;
    @OneToMany(mappedBy = "usersEntity", orphanRemoval = true)
    private Set<RoomsEntity> roomsEntities;

    @Column(name = "user_name")
    String user_name;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public UsersEntity(long user_id, String user_name) {
        super();
        this.user_id = user_id;
        this.user_name = user_name;
    }
}

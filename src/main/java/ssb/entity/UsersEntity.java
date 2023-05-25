package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "users",schema = "public")
@Entity
public class UsersEntity extends PanacheEntity {

    public UsersEntity() {
        super();
    }
    @Column(name = "user_id")
    long user_id;

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

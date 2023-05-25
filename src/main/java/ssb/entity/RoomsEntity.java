package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.Date;


@Table(name = "rooms",schema = "public")
@Entity
public class RoomsEntity extends PanacheEntityBase {

    public RoomsEntity() {
        super();
    }

    @Id
    @Column(name = "id")
    Long id;

    //@ForeignKey
    @Column(name = "movie_id")
    Long movie_id;

    @Column(name = "room_number")
    int room_number;

    @Column(name = "date")
    Date date;

    @Column(name = "time")
    LocalTime time;

    @Column(name = "seat")
    int seat;

    @Column(name = "avaliable")
    boolean avaliable;

    @Column(name = "user_id")
    long user_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public RoomsEntity(Long id, Long movie_id, int room_number, Date date, LocalTime time, int seat, boolean avaliable, long user_id) {
        super();
        this.id = id;
        this.movie_id = movie_id;
        this.room_number = room_number;
        this.date = date;
        this.time = time;
        this.seat = seat;
        this.avaliable = avaliable;
        this.user_id = user_id;
    }

}

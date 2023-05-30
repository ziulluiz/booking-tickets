package ssb.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;


@Table(name = "rooms",schema = "public")
@Entity
@Setter
@Getter
@ToString

public class RoomsEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "movie_id")
    Long movie_id;

    @Column(name = "room_number")
    int room_number;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "time")
    LocalTime time;

    @Column(name = "seat")
    int seat;

    @Column(name = "avaliable")
    boolean avaliable;

    @Column(name = "user_id")
    Long user_id;


}

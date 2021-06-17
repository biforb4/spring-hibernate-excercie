package pl.infoshare.eventrooms.event.model;

import pl.infoshare.eventrooms.guest.model.Guest;
import pl.infoshare.eventrooms.room.model.Room;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    LocalDateTime startDate;
    LocalDateTime endDate;
    @OneToMany
    @JoinColumn(name = "event_id")
    Set<Guest> guests;
    @ManyToOne
    Room room;

}

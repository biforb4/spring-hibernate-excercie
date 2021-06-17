package pl.infoshare.eventrooms.room.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import pl.infoshare.eventrooms.event.model.Event;
import pl.infoshare.eventrooms.room.validation.ValidCity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Setter
@Getter
public class Room {
    @Id
    @GeneratedValue
    Integer id;
    RoomSize size;
    @ValidCity
    String city;
    Boolean parquetAvailable;
    @Range(min = 100, max = 1000)
    BigDecimal pricePerGuest;
    @OneToMany(mappedBy = "room")
    Set<Event> events;
}

package pl.infoshare.eventrooms.guest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guest {
    @Id
    @GeneratedValue
    Integer id;

    String firstName;
    String lastName;
    Integer age;

}

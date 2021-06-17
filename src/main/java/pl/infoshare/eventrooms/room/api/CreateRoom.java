package pl.infoshare.eventrooms.room.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.infoshare.eventrooms.room.model.Room;
import pl.infoshare.eventrooms.room.RoomRepository;

import javax.validation.Valid;

@RestController
public class CreateRoom {

    private final RoomRepository repository;

    public CreateRoom(RoomRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/api/rooms")
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@Valid @RequestBody Room room) {
        repository.save(room);
    }
}

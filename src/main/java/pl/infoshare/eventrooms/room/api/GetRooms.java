package pl.infoshare.eventrooms.room.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;
import pl.infoshare.eventrooms.room.RoomRepository;
import pl.infoshare.eventrooms.room.model.RoomOverview;

@RestController
public class GetRooms {
    private final RoomRepository repository;

    public GetRooms(RoomRepository repository) {
        this.repository = repository;
    }

    public Page<RoomOverview> get(Pageable pageable) {
        return repository.findAllProjectedBy(pageable);
    }
}

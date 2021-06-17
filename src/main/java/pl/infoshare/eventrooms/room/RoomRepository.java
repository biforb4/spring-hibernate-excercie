package pl.infoshare.eventrooms.room;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import pl.infoshare.eventrooms.room.model.Room;
import pl.infoshare.eventrooms.room.model.RoomOverview;

@Component
public interface RoomRepository extends JpaRepository<Room, Integer> {
    Page<RoomOverview> findAllProjectedBy(Pageable pageable);
}

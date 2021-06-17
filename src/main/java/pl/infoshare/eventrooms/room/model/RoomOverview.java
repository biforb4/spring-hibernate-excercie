package pl.infoshare.eventrooms.room.model;

import java.math.BigDecimal;

public interface RoomOverview {
    Integer getId();
    RoomSize getSize();
    Boolean getParquetAvailable();
    String getCity();
    BigDecimal getPricePerGuest();
}

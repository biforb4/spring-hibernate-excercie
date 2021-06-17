package pl.infoshare.eventrooms.common.api;

import lombok.Value;

@Value
public class ErrorDetails {
    String message;
    String code;
}

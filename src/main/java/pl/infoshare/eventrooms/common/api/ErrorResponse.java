package pl.infoshare.eventrooms.common.api;

import lombok.Getter;

import java.util.List;

@Getter
public class ErrorResponse {
    Integer numberOfErrors;
    List<ErrorDetails> errors;

    public ErrorResponse(List<ErrorDetails> errors) {
        this.numberOfErrors = errors.size();
        this.errors = errors;
    }
}

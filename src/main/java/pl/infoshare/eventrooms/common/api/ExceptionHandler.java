package pl.infoshare.eventrooms.common.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        var errors = ex.getFieldErrors()
                .stream()
                .map(fieldError -> new ErrorDetails(fieldError.getField() + ": " + fieldError.getDefaultMessage(), fieldError.getCode()))
                .collect(Collectors.toList());

        return ResponseEntity.badRequest().body(new ErrorResponse(errors));
    }
}

package pl.infoshare.eventrooms.room.validation;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ValidCityValidator implements ConstraintValidator<ValidCity, String> {
    @Value("${room.cities}")
    private List<String> cities;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return cities.contains(value);
    }
}

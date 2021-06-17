package pl.infoshare.eventrooms.room.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

@Target({FIELD, METHOD, PARAMETER, TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidCityValidator.class)
public @interface ValidCity {
    String message() default "Invalid city";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

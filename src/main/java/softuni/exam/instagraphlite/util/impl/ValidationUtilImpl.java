package softuni.exam.instagraphlite.util.impl;

import org.springframework.stereotype.Component;
import softuni.exam.instagraphlite.util.ValidationUtil;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class ValidationUtilImpl implements ValidationUtil {

    private final Validator validator;

    public ValidationUtilImpl() {
        validator = Validation
                .buildDefaultValidatorFactory()
                .getValidator();
    }

    @Override
    public <T> boolean isValid(T entity) {
        return validator.validate(entity).isEmpty();
    }

//    @Override
//    public <T> Set<ConstraintViolation<T>> violation(T entity) {
//        return validator.validate(entity);
//    }


}

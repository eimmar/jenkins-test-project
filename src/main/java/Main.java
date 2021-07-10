import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pojo.Car;

import javax.validation.Validation;
import javax.validation.Validator;

public class Main {
    private final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        var car = new Car();

        car.setBrand("BMW");
        validator.validate(car);

        System.out.println("Done.");
    }
}

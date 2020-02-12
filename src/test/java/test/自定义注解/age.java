package test.自定义注解;

import java.lang.annotation.*;

@Target(value=ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface age {
        String name();
}

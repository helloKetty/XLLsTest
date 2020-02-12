package test.自定义注解;

import org.junit.Test;

import java.lang.reflect.Field;

public class App {
    @Test
    public  void ei() throws NoSuchFieldException {
    Friends friends=new Friends();
        Field f = friends.getClass().getDeclaredField("name");
        System.out.println(f.getAnnotation(age.class).name());


    }
}

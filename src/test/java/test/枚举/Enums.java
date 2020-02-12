package test.枚举;

import java.util.Random;

public class Enums
{
    private static Random random=new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }
    public  static  <T> T random(T[]values){
        Integer ord=random.nextInt(values.length);
        System.out.println(ord);
        return  values[ord];
    }
}

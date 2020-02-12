package test.枚举;

public class People {
    private static People ourInstance = new People();

    public static People getInstance() {
        return ourInstance;
    }

    private People() {
    }
}

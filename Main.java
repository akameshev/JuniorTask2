import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "TestString";
        System.out.println("Count of methods of Class String: " + getDeclaredMethods(name).length);
        Arrays.stream(getDeclaredMethods(name)).toList().forEach(System.out::println);
    }

    private static <T> Method[] getDeclaredMethods(T object) {
        Class<?> clazz = object.getClass();
        return clazz.getDeclaredMethods();
    }
}

package Generics;

public class Test5 {
    public static <T> T get(T t) {
        return t;
    }
    public static void main(String[] args) {
        String str = get("HELLO");
        System.out.println(str);
    }
}

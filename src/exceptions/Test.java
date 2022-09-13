package exceptions;

public class Test {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        } catch(IndexOutOfBoundsException|NullPointerException  ex) {
            System.out.println("Done");
        }
    }
}

package Dumps;
 interface Moveable<Integer> {
    public default void walk (Integer distance) {System.out.println("Walking");}
        public void run(Integer distance);
    }

public class Question61 {
    public static void main(String[] args) {
        Moveable<Integer> animal = n -> System.out.println("Running " + n);
        animal.run(100);
        animal.walk(20);
    }
}

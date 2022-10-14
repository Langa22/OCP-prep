package Setion1ExamTopis;

import java.util.function.Supplier;

class Bird {
    public void fly () { System.out.print("Can fly"); }
}
class Penguin extends Bird {
    public void fly () { System.out.print("Cannot fly"); }
}
public class Question7 {
    public static void main (String [ ] args) {
        fly( ( ) -> new Bird ( ));
        fly (Penguin :: new);
    }
    static void fly (Supplier<Bird> bird) { bird.get( ).fly(); }
}

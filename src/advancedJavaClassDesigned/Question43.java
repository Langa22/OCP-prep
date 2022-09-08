package advancedJavaClassDesigned;
class Outer3 {
    public static void sayHello() {}
    static {
        class Inner {
            /*INSERT*/
        }
        new Inner();
    }
}
public class Question43 {
    public static void main(String[] args) {
        Outer3.sayHello();
    }
}

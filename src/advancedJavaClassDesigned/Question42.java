package advancedJavaClassDesigned;
class A4 {
    public void someMethod(final String name) {
        /*INSERT*/ class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();
    }
}
public class Question42 {
    public static void main(String[] args) {
        new A4().someMethod("World!");
    }
}

package advancedJavaClassDesigned;
class Foo {
    public static void m1() {
        System.out.println("Foo : m1()");
    }
     class Bar {
//        public static void m1() {
//            System.out.println("Bar : m1()");
//        }
    }
}
public class Question35 {
    public static void main(String [] args) {
        Foo foo = new Foo();
        Foo.Bar bar = foo.new Bar();
        //bar.m1();
    }
}

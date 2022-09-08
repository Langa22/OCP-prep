package advancedJavaClassDesigned;
class Foo1 {
    static { //static initialization block
        System.out.print(1);
    }
    class Bar {
//        static { //static initialization block
//            System.out.print(2);
//        }
    }
}
public class Question39 {
    public static void main(String [] args) {
        new Foo1().new Bar();
    }
}

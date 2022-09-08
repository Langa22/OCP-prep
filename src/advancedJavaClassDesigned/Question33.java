package advancedJavaClassDesigned;
class Outer1 {
    class Inner {
        public void m() {
            System.out.println("WELCOME!");
        }
    }
}
public class Question33 {
    public static void main(String[] args) {
        //Insert statement here
        Outer1.Inner obj2=new Outer1().new Inner();
    }
}

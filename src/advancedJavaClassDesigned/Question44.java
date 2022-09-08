package advancedJavaClassDesigned;
class A5 {
    public void print(String name) {
        class B {
            public void B() {
                System.out.println(name); //Line 5
            }
        }
    }
    //B obj = new B(); //Line 9
}
public class Question44 {
    public static void main(String[] args) {
        new A5().print("OCP"); //Line 14
    }

}

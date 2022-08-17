package innerClasses;
//We can access both static and non-static members of the class
public class Outer5 {
    int x=10;
    static int y=20;
    class Inner5{
        public void m1(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
         new Outer5().new Inner5().m1();
    }
}

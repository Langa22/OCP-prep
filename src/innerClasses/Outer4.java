package innerClasses;
//We can access the inner class outside the outer class
public class Outer4 {
    class Inner4{
        public void m1(){
            System.out.println("Inner class");
        }
    }
}
class Test4{
    public static void main(String[] args) {
        Outer4 o=new Outer4();
        Outer4.Inner4 i=o.new Inner4();
        i.m1();
    }
}

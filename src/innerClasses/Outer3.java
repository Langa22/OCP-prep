package innerClasses;

public class Outer3 {
    //We can access the inner class method using
    //instance methods
    class Inner3{
        public void m1(){
            System.out.println("Inner class");
        }
    }
    public void m2(){
        Inner3 i=new Inner3();
        i.m1();
    }
    public static void main(String[] args) {
        Outer3 o=new Outer3();
        o.m2();
    }
}

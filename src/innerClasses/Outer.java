package innerClasses;

public class Outer {
    class Inner{
        //Inner class can take instance methods
        public void m1(){
            System.out.println("Inner class method");
        }
    }
    public static void main(String[] args) {
        //We can access the method using the outer class
        //object
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.m1();
    }
}

package Dumps;
class Foo1 {
    public void methodB(String s) {
        System.out.println("Foo " + s);
    }
}
    class Bar extends Foo1{
        public void methodB(String s){System.out.println("Bar "+s);}
    }
    class Baz extends Bar{
        public void methodB(String s){System.out.println("Baz "+s);}
    }
    class Daze extends Baz{
        private Bar bb=new Bar();
        public void methodB(String s){
            bb.methodB(s);
            super.methodB(s);
        }
    }

public class Question90 {
    public static void main(String[] args) {
        Baz d=new Daze();
        d.methodB("Hello");
    }
}

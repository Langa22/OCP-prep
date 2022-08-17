package innerClasses;

public class Outer6 {
    int x=10;
    class Inner6{
        int x=100;
        public void m1(){
            int x=1000;
            System.out.println(x);//Variable shadowing it takes the closest variable
            System.out.println(this.x);//We use this to access the instance variable of the inner class
            System.out.println(Outer6.this.x);//We use this to access the instance variable of the outer class
        }
    }
    public static void main(String[] args) {
        new Outer6().new Inner6().m1();
    }
}

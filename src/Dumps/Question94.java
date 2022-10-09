package Dumps;
class Product5{
    String pname;
    public Product5(String pname) {
        this.pname = pname;
    }
}
public class Question94 {
    public static void main(String[] args) {
        Product5 p1=new Product5("PowerCharger");
        Product5 p2=p1;
        System.out.println(p1.equals(p2));
        Product5 p3=new Product5("PowerCharger");
        System.out.println(p1.equals(p3));
    }
}

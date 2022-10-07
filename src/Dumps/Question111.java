package Dumps;

public class Question111 {
    public double applyDiscount(double price){
        assert (price>0);
        return price*0.50;
    }
    public static void main(String[] args) {
        Question111 p=new Question111();;
        double newPrice=p.applyDiscount(Double.parseDouble(args[0]));
        System.out.println("New Price: "+newPrice);
    }
}

package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Product1{
    String name;
    int qty;
    public String toString(){
        return name;
    }

    public Product1(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    static class ProductFilter{
//        public static boolean isAvailable(Product p){
//            return p.qty>=10;
//        }
        Predicate<Product1>predicate=product1 -> {return product1.qty>=10;};
    }
}
public class Question87 {
    public static void main(String[] args) {
        List<Product1>product1s= Arrays.asList(
                new Product1("MotherBoard",5),
                new Product1("Speaker",20)
        );
        product1s.stream()
                //.filter(p->p.ProductFilter.test(p))
                .forEach(p-> System.out.println(p));
    }
}

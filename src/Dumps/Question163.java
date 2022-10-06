package Dumps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product2 {
    int id; int price;
    public Product2(int id, int price) {
        this.id = id;
        this.price = price;
    }
    public String toString () { return id + ":" + price;}
    }

public class Question163 {
    public static void main(String[] args) {
        List<Product2> products = new ArrayList<>(Arrays.asList(new Product2(1, 10),
                new Product2 (2, 30),
                new Product2 (3, 20)));
        Product2 p = products.stream().reduce(new Product2 (4, 0), (p1, p2) -> {
            p1.price+=p2.price;
            return new Product2 (p1.id, p1.price);});
        products.add(p);
        products.stream().parallel()
                .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
                .ifPresent(System.out::println);
    }
}

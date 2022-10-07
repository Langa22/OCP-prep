package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Product4{
    String name;
    Integer price;

    public Product4(String name, Integer price) {
        this.name = name;
        this.price = price;;
    }
    public void printVal(){System.out.print(name+" Price:"+price+" ");}
    public Integer getPrice() {return price;}
    public void setPrice(Integer price) {this.price = price;}
}
public class Question130 {
    public static void main(String[] args) {
        List<Product4>li= Arrays.asList(new Product4("TV",1000),new Product4("Refrigerator",2000));
        Consumer<Product4>raise=e->e.setPrice(e.getPrice()+100);
        li.forEach(raise);
        li.stream().forEach(Product4::printVal);
    }
}

package Dumps;

import java.util.function.DoubleSupplier;

public class Question92 {
   String name;
   Integer cost;
   public Question92(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }
    String getName() {return name;}
    int getCost() {return cost;}

    public static void main(String[] args) {
        Question92 j1=new Question92("IT",null);
        DoubleSupplier js1=j1::getCost;
        System.out.println(j1.getName()+":"+js1.getAsDouble());
    }
}

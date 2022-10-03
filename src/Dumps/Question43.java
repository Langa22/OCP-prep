package Dumps;

interface Rideable {Car getCar (String name); }
class Car {
    private String name;
    public Car (String name) {
        this.name = name;
    }
}
public class Question43 {
    public static void main(String[] args) {
        Rideable rider=Car::new;
        Car vehicle=rider.getCar("MyCar");
    }
}

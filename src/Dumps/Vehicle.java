package Dumps;

public class Vehicle {
    int distance;
    Vehicle (int x){
        this.distance=x;
    }
    public void increSpeed(int time){
        int timeTravel=time;
        class Car{
            int value = 0;
            public void speed(){
                value=distance/timeTravel;
                System.out.println("Velocity with new speed "+value+" kmph");
            }
        }
        new Car().speed();
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle v=new Vehicle(100);
        v.increSpeed(60);
    }
}

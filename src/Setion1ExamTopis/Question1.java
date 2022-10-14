package Setion1ExamTopis;

class Vehicle {
    int distance;

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) {
        int timeTravel = time; //line n1
//line n3
        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel; //line n2
                System.out.println("Velocity with new speed" + value + "kmph");
            }
        }
        //speed(); //line n3
    }
}
public class Question1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle (100);
        v.increSpeed(60);
    }
}

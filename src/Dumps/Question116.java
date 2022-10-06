package Dumps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Vehicle4{
    int vId;
    String vName;

    public Vehicle4(int vId, String vName) {
        this.vId = vId;
        this.vName = vName;
    }

    public int getvId() {return vId;}
    public String getvName() {return vName;}
    public String toString() {
        return vName;
    }
}
public class Question116 {
    public static void main(String[] args) {
        List<Vehicle4>vehicle= Arrays.asList(
                new Vehicle4(2,"Car"),
                new Vehicle4(3,"Bike"),
                new Vehicle4(1,"Truck"));
        vehicle.stream()
                .sorted(Comparator.comparing ((Vehicle4 v) -> v.getvId()))
                .forEach(System.out::print);
    }
}

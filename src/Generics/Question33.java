package Generics;

import java.util.Map;
import java.util.TreeMap;

enum TrafficLight {
    YELLOW,RED, GREEN
}
public class Question33 {
    public static void main(String[] args) {
        Map<TrafficLight, String> map = new TreeMap<>();
        map.put(TrafficLight.GREEN, "GO");
        map.put(TrafficLight.RED, "STOP");
        map.put(TrafficLight.YELLOW, "READY TO STOP");

        for(String msg : map.values()) {
            System.out.println(msg);
        }
    }

}

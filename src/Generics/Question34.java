package Generics;

import java.util.Map;
import java.util.TreeMap;
enum TrafficLight1 {
    RED, YELLOW, GREEN
}

public class Question34 {
    public static void main(String[] args) {
        Map<TrafficLight1, String> map = new TreeMap<>();
        map.put(TrafficLight1.GREEN, "GO");
        map.put(TrafficLight1.RED, "STOP");
        map.put(TrafficLight1.YELLOW, "STOP IN 3 Seconds");
        map.put(TrafficLight1.YELLOW, "READY TO STOP");

        for(String msg : map.values()) {
            System.out.println(msg);
        }
    }

}

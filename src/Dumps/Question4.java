package Dumps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question4 {
    public static void main(String[] args) {
        Map<Integer,String> unsortedMap=new HashMap<>();
        unsortedMap.put(10,"z");
        unsortedMap.put(5,"b");
        unsortedMap.put(1,"d");
        unsortedMap.put(7,"e");
        unsortedMap.put(50,"j");

        Map<Integer,String>treeMap=new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.putAll(unsortedMap);
        for(Map.Entry<Integer,String>entry: treeMap.entrySet()){
            System.out.print(entry.getValue());
        }
    }
}

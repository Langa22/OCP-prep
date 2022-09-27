package Dumps;

import java.util.Map;
import java.util.TreeMap;

public class Question16 {
    public static void main(String[] args) {
        Map<String, Integer> books = new TreeMap<>();
        books.put("A",1007);
        books.put("C",1002);
        books.put("B",1001);
        books.put("B",1003);
        System.out.println(books);
    }
}

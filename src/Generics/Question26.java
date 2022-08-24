package Generics;

import java.util.ArrayList;
import java.util.List;

public class Question26 {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add(1);
        list.add("2");
        list.forEach(System.out::print);
    }
}

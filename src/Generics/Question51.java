package Generics;

import java.util.ArrayList;
import java.util.List;

public class Question51 {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add("3"); //Line 11
        //list.removeIf(i -> i % 2 == 1); //Line 12
        System.out.println(list);
    }

}

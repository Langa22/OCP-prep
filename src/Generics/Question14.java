package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        List<? extends String> list = new ArrayList<>(Arrays.asList("A", "E", "I", "O")); //Line 8
        //Error
        //list.add("U"); //Line 9
        list.forEach(System.out::print);
    }
}

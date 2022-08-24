package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question59 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("M", "R", "A", "P");
        Collections.sort(list, null);
        System.out.println(list);
    }

}

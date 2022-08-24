package Generics;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Question44 {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>(Arrays.asList("red", "green", "blue", "gray"));
        System.out.println(set.ceiling("gray"));
        System.out.println(set.floor("gray"));
        System.out.println(set.higher("gray"));
        System.out.println(set.lower("gray"));
    }
}

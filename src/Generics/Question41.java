package Generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Question41 {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>(Arrays.asList('a','b','c','A','a','c'));
        set.stream().forEach(System.out::print);
    }
}

package Generics;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question46 {
    public static void main(String[] args) {
        Deque<Character> chars = new ArrayDeque<>();
        chars.add('A');
        chars.add('B');
        chars.remove();
        chars.add('C');
        chars.remove();

        System.out.println(chars);
    }

}

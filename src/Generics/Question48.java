package Generics;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question48 {
    public static void main(String[] args) {
        Deque<Character> chars = new ArrayDeque<>();
        chars.add('A');
        chars.remove();
        chars.remove();

        System.out.println(chars);
    }

}

package Dumps;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question115 {
    public static void main(String[] args) {
        Deque<String>queue=new ArrayDeque<>();
        queue.add("Susan");
        queue.add("Allen");
        queue.add("David");
        System.out.println(queue.pop());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}

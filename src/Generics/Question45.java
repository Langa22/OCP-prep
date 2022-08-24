package Generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question45 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("ONE");
        list.add("TWO");
        list.remove(1);
        System.out.println(list);

        Queue<String> queue = new LinkedList<>();
        queue.add("ONE");
        queue.add("TWO");
        queue.remove();
        System.out.println(queue);
    }
}

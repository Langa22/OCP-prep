package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Question48 {
    public static void main(String[] args) {
        int ref = 10;
        List<Integer> list = new ArrayList<>();
        list.stream().anyMatch(i -> {
            System.out.println("HELLO");
            return i > ref;
        });
    }
}

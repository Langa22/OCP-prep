package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class Question34 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 100, 1000);
        list.replaceAll(i -> -i++);

        System.out.println(list);
    }
}

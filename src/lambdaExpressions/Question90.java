package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question90 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Z", "X", "Y"));
        System.out.println(list.stream().sorted().findFirst().get());
        System.out.println(list.get(2));
    }
}

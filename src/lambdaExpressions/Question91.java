package lambdaExpressions;

import java.util.HashMap;
import java.util.Map;

public class Question91 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ONE");
        map.put(2, "TWO");
        map.put(3, "THREE");
        /*
        There is no stream() method available in Map interface and
        hence map.stream() causes compilation error
         */
        //System.out.println(map.stream().count());
    }
}

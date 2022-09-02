package lambdaExpressions;

import java.util.stream.IntStream;

public class Question71 {
    public static void main(String[] args) {
        int res = 1;
        IntStream stream = IntStream.rangeClosed(1, 5);

        /*INSERT*/
        System.out.println(stream.reduce(2,(i,j)->i*j));
    }
}

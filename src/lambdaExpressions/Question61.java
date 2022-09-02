package lambdaExpressions;

import java.util.OptionalInt;
class MyException extends Exception{}
public class Question61 {
    public static void main(String[] args) {
        OptionalInt optional = OptionalInt.empty();
        //System.out.println(optional.orElseThrow(MyException::new));
    }
}

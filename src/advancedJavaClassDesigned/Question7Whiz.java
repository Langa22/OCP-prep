package advancedJavaClassDesigned;

import java.util.Arrays;

public class Question7Whiz {
    public static void main(String[] args) {
        Value []values={Value.LOW,Value.HIGH,Value.MEDIUM};
        Arrays.sort(values);
        System.out.println(values[0]);
    }
}
enum Value{
    HIGH(1),MEDIUM(6),LOW(3);
    private final int level;
    private Value(int levelCode){
        level=levelCode;
    }
}
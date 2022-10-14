package Setion1ExamTopis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question46 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList (10, 20, 8);
        System.out.println (
                nums.stream().max(Comparator.comparing(a -> a)).get()//line n1
        );
    }
}

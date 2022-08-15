package lambdaExpressions;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        //Check if number is greater or less than 10
        Predicate<Integer>p=n->n>10;
        System.out.println(p.test(5));//false
        System.out.println(p.test(11));//true
        System.out.println(p.test(10));//false
        System.out.println();
        //Check if the length of the string is greater than 4
        Predicate<String>s=str->str.length()>4;
        System.out.println(s.test("Lunga"));//true
        System.out.println(s.test("Hi"));//false
        System.out.println(s.test("Ayanda"));//true
        System.out.println();
        //Check the length of names in array
        String names[]={"Lungaz","Lizi"};
        for (String n:names) {
            Predicate<String>s2=str2->str2.length()>4;
            System.out.println(s2.test(n));
        }
    }
}

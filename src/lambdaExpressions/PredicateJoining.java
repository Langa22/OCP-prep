package lambdaExpressions;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int[]arr={5,15,20,25,30,35,40,45,50,55,60,65};
        Predicate<Integer>p1=i->i%2==0;
        Predicate<Integer>p2=i->i>50;
        //To join predicates we can use and,or AND negate

        //and operator
        for(int n:arr){
            if(p1.and(p2).test(n)){
                System.out.println(n);
            }
        }
        //or operator
        for(int n:arr){
            if(p1.or(p2).test(n)){
                System.out.println(n);
            }
        }
        //negate operator
        for(int n:arr){
            if(p1.negate().test(n)){
                System.out.println(n);
            }
        }
    }
}

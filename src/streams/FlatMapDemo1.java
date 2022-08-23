package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer>firstList= Arrays.asList(2,3,4,5);
        List<Integer>secondList= Arrays.asList(21,32,43,54);
        List<Integer>thirdList= Arrays.asList(212,334,456,578);
        List<Integer>forthList= Arrays.asList(2,3,4,5);
        List<List<List<List<Integer>>>>l= new ArrayList<>();

        List<List<Integer>>listOfAll=Arrays.asList(firstList,secondList,thirdList,forthList);
        listOfAll.stream().flatMap(i->i.stream()).map(n->n+0).forEach(System.out::println);
    }
}

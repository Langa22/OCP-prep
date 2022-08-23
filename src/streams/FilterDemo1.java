package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer>numberList=new ArrayList<Integer>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(33);
        numberList.add(44);
        numberList.add(76);
        List<Integer> oddNumbers=new ArrayList<>();
        oddNumbers=numberList.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println(oddNumbers);

        //Just printing the data
        numberList.stream().filter(n->n%2==1).forEach(System.out::println);
    }
}

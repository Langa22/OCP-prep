package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sisanda","Ayanda","Lungas","hi","Loftus");
        List<String>l1=new ArrayList<>();
        List<String>l2=new ArrayList<>();
        l1=names.stream().filter(n->n.length()<5 && n.length()>=2).collect(Collectors.toList());;
        System.out.println(l1);

        //using map and filter at the same time.
        l2=names.stream().filter(n->n.length()>3).map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
}

package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(45);
        l.add(457);
        l.add(4);
        l.add(450);
        l.add(47);
        l.add(42);
        Collections.sort(l,(i,i2)->i2-i);
        System.out.println(l);

        ArrayList<String>l2=new ArrayList<>();
        l2.add("Asa");
        l2.add("Noms");
        l2.add("A");
        l2.add("B");
        l2.add("Z");
        l2.add("Me");
        Collections.sort(l2, (String s, String s1) ->s.compareToIgnoreCase(s1));
        System.out.println(l2);
    }
}

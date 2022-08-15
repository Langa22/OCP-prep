package Generics;

import java.util.ArrayList;

public class Behavior {
    public static void main(String[] args) {
        ArrayList<String>l=new ArrayList<>();
        l.add("lll");
        l.add("ooo");
        m1(l);
        System.out.println(l);
    }
    public static void m1(ArrayList l){
        l.add(10);
        l.add(11);
    }
}

package Generics;

import java.util.ArrayList;

public class Example {
    public static void m1(ArrayList<String>l){
        l.add("String");
        //System.out.println(l);
    }
    public static void m2(ArrayList<?>l){
        //l.add("String");
        System.out.println(l);
    }

    public static void main(String[] args) {
        ArrayList<String>l=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Double>l2=new ArrayList<>();
        ArrayList<Float>l3=new ArrayList<>();
        ArrayList<Character>l4=new ArrayList<>();
        l4.add('C');
        m1(l);
        m2(l4);
        m2(l3);
        m2(l);
    }
}

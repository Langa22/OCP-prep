package Generics;

import java.util.ArrayList;

public class GenericMethods {
    static void m1(ArrayList<? super Number>l){
        l.add(3);
        l.add(4);
        System.out.println(l);
    }

    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        //m1();
    }
}

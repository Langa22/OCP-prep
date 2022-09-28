package Generics;

import java.util.*;

public class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating a Set interface with
        // reference to TreeSet class
        // Declaring object of string type
        TreeMap<GFG,String> ts = new TreeMap<>();

        // Elements are added using add() method
        ts.put(new GFG(),"Geek");
//        ts.add("For");
//        ts.add("Geeks");

        // Print all elements inside object
        System.out.println(ts);
    }
}

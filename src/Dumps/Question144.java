package Dumps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person1 implements Comparable<Person1> { //line n1
    String name;
    Person1(String name){
        this.name=name;
    }
    public int compareTo(Person1 p1){
        return this.name.compareTo(p1.name);
    }//line n2
}
public class Question144 {
    public static void main(String[] args) {
        List<Person1>emps=new ArrayList<>();
        Collections.sort(emps);
    }
}

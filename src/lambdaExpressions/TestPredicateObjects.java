package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateObjects {
    String name;
    int salary;
    int age;
    public TestPredicateObjects(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        TestPredicateObjects obj=new TestPredicateObjects("Langa",100,23);
        Predicate<TestPredicateObjects>p=e->(e.salary>1000&&e.age>18);
        //System.out.println(p.test(obj));

        ArrayList<TestPredicateObjects>al=new ArrayList<>();
        al.add(new TestPredicateObjects("Nono",1000,17));
        al.add(new TestPredicateObjects("Asavela",2399,20));
        al.add(new TestPredicateObjects("Zim",670,90));
        al.add(new TestPredicateObjects("NonoLo",1000,5));
        for(TestPredicateObjects e:al){
            if(p.test(e)){
                System.out.println(e.name+" "+e.age);
            }
        }
    }
}

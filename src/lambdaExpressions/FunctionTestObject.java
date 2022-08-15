package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTestObject {
    String name;
    int salary;

    public FunctionTestObject(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList<FunctionTestObject>emplist=new ArrayList<>();
        emplist.add(new FunctionTestObject("Lungazz",26000));
        emplist.add(new FunctionTestObject("Masbi",12400));
        emplist.add(new FunctionTestObject("Hlehle",1000));

        //We are checking the salary and returning the bonus using function.
        Function<FunctionTestObject,Integer>fn=e->{
            int sal=e.salary;
            if(sal>=10000&&sal<=20000)
                return (sal*(10/100));
            else if (sal>20000&&sal<=30000)
                return (sal*(20/100));
            else if (sal>30000&&sal<=50000)
                return (sal*(30/100));
            else
                return (sal*40/100);

            };
        //Filtering the data on if the bonus is greater than 50 and printing the
        //Values using a predicate.
        Predicate<Integer>predicate=b->b>50;
        for (FunctionTestObject f:emplist) {
            int bonus = fn.apply(f);
            if (predicate.test(bonus)) {
                System.out.println("Name :" + f.name + " " + "Salary :" + f.salary + " " + "Bonus :" + bonus);
            }
        }
    }
}


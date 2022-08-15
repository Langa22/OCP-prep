package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInTest {
    String name;
    Integer Salary;
    String position;

    public BuiltInTest(String name, int salary, String position) {
        this.name = name;
        Salary = salary;
        this.position = position;
    }

    public static void main(String[] args) {
        ArrayList<BuiltInTest> builtInTests = new ArrayList<>();
        builtInTests.add(new BuiltInTest("Asavela", 20000, "Junior"));
        builtInTests.add(new BuiltInTest("Sisanda", 40000, "Intermediate"));
        builtInTests.add(new BuiltInTest("Zonke", 20000, "Junior"));
        builtInTests.add(new BuiltInTest("Sogoni", 80000, "DR"));
        builtInTests.add(new BuiltInTest("Masbi", 45000, "Junior"));

        Function<BuiltInTest, Integer> fn = i -> i.Salary * 10 / 100;
        Predicate<Integer> p = i1 -> i1 > 3900;
        Consumer<BuiltInTest> consumer = c -> {
            System.out.println("Name :" + c.name);
            System.out.println("Salary :" + c.Salary);
            System.out.println("Position :" + c.position);
            System.out.println();
        };
        for (BuiltInTest b:builtInTests) {
            int bonus =fn.apply(b);
            if(p.test(bonus)){
                consumer.accept(b);
            }
        }

    }
}
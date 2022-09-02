package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
class Employee2 {
    private String name;
    private double salary;

    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
}

public class Question18 {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(new Employee2("Jack", 8000),
                new Employee2("Lucy", 12000));
        updateSalary(employees, d -> d < 10000);
        employees.forEach(System.out::println);
    }

    private static void updateSalary(List<Employee2> list, DoublePredicate predicate) {
        for(Employee2 e : list) {
            if(predicate.negate().test(e.getSalary())) {
                e.setSalary(e.getSalary() + 2000);
            }
        }
    }

}

package lambdaExpressions;

import java.util.stream.Stream;
class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "{" + name + ", " + salary + "}";
    }

    public static int salaryCompare(double d1, double d2) {
        return new Double(d2).compareTo(d1);
    }
}
public class Question65 {
    public static void main(String[] args) {
        Stream<Employee1> employees = Stream.of(new Employee1("Jack", 10000),
                new Employee1("Lucy", 12000), new Employee1("Tom", 7000));

        highestSalary(employees);
    }

    private static void highestSalary(Stream<Employee1> emp) {
        System.out.println(emp.map(e -> e.getSalary()).max(Employee1::salaryCompare));
    }
}

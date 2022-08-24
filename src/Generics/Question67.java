package Generics;

import java.util.Arrays;
import java.util.List;

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

public class Question67 {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(new Employee2("Jack", 10000), new Employee2("Lucy", 12000));
        employees.forEach(e -> e.setSalary(e.getSalary() + (e.getSalary() * .2)));
        employees.forEach(System.out::println);
    }

}

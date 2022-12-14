package Generics;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }

    @Override
    public int compareTo(Employee o) {
        return o.age - this.age;
    }
}
public class Question52 {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("Udayan", 31));
        employees.add(new Employee("Neha", 23));
        employees.add(new Employee("Hou Jian", 42));
        employees.add(new Employee("Smita", 29));

        System.out.println(employees);
    }

}

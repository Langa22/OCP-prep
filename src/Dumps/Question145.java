package Dumps;

import java.util.Arrays;
import java.util.List;

class Person{
    private String firstname;
    private int salary;

    public Person(String firstname, int salary) {
        this.firstname = firstname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getSalary() {
        return salary;
    }
}
public class Question145 {
    public static void main(String[] args) {
        List<Person>prog= Arrays.asList(
                new Person("Smith",1500),
                new Person("John",2000),
                new Person("joe",1000));
        double dVal=prog.stream()
                .filter(s->s.getFirstname().startsWith("J"))
                .mapToInt(Person::getSalary)
                .average()
                .getAsDouble();
        System.out.println(dVal);
    }
}

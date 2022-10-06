package Dumps;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String dept,name;

    public Employee(String dept, String name) {
        this.dept = dept;
        this.name = name;
    }
    public String toString() {
        return getDept()+":" + getName() ;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }
}
public class Question160 {
    public static void main(String[] args) {
        List<Employee>emps= Arrays.asList(new Employee("Sales","Ada"),
                new Employee("Sales","Bob"),
                new Employee("hr","Bob"),
                new Employee("hr","Eva"));
        Stream<Employee>s=emps.stream()
                .sorted(Comparator.comparing((Employee e)->e.getDept())
                        .thenComparing((Employee e)->e.getName()));
        List<Employee>eSorted=s.collect(Collectors.toList());
        System.out.println(eSorted);


    }
}

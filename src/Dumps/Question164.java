package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student2 {
    String course, name, city;

    public Student2(String name, String course, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return course + ":" + name + ":" + city;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
public class Question164 {
    public static void main(String[] args) {
        List<Student2> stds = Arrays.asList(
                new Student2 ("Jessy", "Java ME", "Chicago"),
                new Student2 ("Helen", "Java EE", "Houston"),
                new Student2 ("Mark", "Java ME", "Chicago"));
//        stds.stream()
//                .collect(Collectors.groupingBy(Student2::getCourse))[
//                .forEach(src,res)->System.out.println(src);

    }
}

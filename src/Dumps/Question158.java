package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student3{
    String course, name,city;
    public Student3(String course, String name, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }
    public String toString() {
        return course + ":" + name + ":" + city;
    }
    public String getCourse() {return course;}
    public String getName() {return name;}
    public String getCity() {return city;}
}
public class Question158 {
    public static void main(String[] args) {
        List<Student2> stds = Arrays.asList(
                new Student2 ("Jessy", "Java MEp", "Chicago"),
                new Student2 ("Helen", "Java EE", "Houston"),
                new Student2 ("Mark", "Java ME", "Chicago"));
       stds.stream()
               .collect(Collectors.groupingBy(Student2::getCourse));
               //.forEach(res)->System.out.println(src);
    }
}

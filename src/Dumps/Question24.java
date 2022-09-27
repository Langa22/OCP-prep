package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String course,name,city;
    public Student(String name,String course,String city){
        this.course=course;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class Question24 {
    public static void main(String[] args) {
        List<Student>stds= Arrays.asList(
                new Student("Jessy","Java ME","Chicago"),
                new Student("Helen","Java EE","Houston"),
                new Student("Mark","Java ME","Chicago")
        );
//        stds.stream()
//                .collect(Collectors.groupingBy(Student::getCourse))
//                .forEach(scr,res)->System.out.println(scr);
    }
}

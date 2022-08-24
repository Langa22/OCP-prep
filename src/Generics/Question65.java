package Generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparator<Student1> {
    private String name;
    private String exam;

    public Student1() {
        super();
    }

    public Student1(String name, String exam) {
        this.name = name;
        this.exam = exam;
    }

    public int compare(Student1 s1, Student1 s2) {
        return s2.name.compareToIgnoreCase(s1.name);
    }

    public String toString() {
        return '{' + name + ", " + exam + '}';
    }
}
public class Question65 {
    public static void main(String[] args) {
        Student1 stud1 = new Student1("John", "OCA");
        Student1 stud2 = new Student1("Jack", "OCP");
        Student1 stud3 = new Student1("Rob", "OCP");
        List<Student1> list = Arrays.asList(stud1, stud2, stud3);
        list.sort(new Student1());
        list.forEach(System.out::println);
    }

}

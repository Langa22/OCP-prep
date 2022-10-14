package Setion1ExamTopis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
    String fName;
    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

public class Question26 {
    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList(
                new Emp("John", "Smith"),
                new Emp("Peter", "Sam"),
                new Emp("Thomas", "Wale"));
        emp.stream()
                .sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))   //line n1
        .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

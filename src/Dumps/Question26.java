package Dumps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
    String fName;
    String lName;
    public Emp(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
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
        List<Emp>emp= Arrays.asList(
                new Emp("John","Smith"),
                new Emp("Peter","Sam"),
                new Emp("Thomas","Wale")
        );
        emp.stream()
                .sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

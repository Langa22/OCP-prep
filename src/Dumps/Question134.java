package Dumps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Person3{
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
}
public class Question134 {
    public static void main(String[] args) {
        List<Person3>sts= Arrays.asList(
                new Person3("Jack",30),
                new Person3("Mike Hill",21),
                new Person3("Thomas Hill",24));
        Stream<Person3>resList=sts.stream().filter(s->s.getAge()>=25);
        long count=resList.filter(s->s.getName().contains("Hill")).count();
        System.out.println(count);
    }
}

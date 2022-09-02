package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsMethods {
    public static void main(String[] args) {
        //Intermediate operations.
        //map: The map method is used to returns a
        //stream consisting of the results of applying the given
        //function to the elements of this stream.
        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x->x+x).collect(Collectors.toList());
        System.out.println(square);


        //filter: The filter method is used to select elements as per the Predicate
        //passed as argument.
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //sorted: The sorted method is used to sort the stream.
        List names1 = Arrays.asList("Reflection","Collection","Stream");
        List result1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result1);

        //collect: The collect method is used to return the
        //result of the intermediate operations performed on the stream.
        List <Integer>number2 = Arrays.asList(2,3,4,5,3);
        Set square2 = number2.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(square2);

        //reduce: The reduce method is used to reduce the elements of a stream to a single value.
        //The reduce method takes a BinaryOperator as a parameter.
        List<Integer> number3 = Arrays.asList(2,3,4,5);
        int even = number3.stream().filter(x->x%2!=0).reduce(2,(ans,i)-> ans+i);
        System.out.println(even);

        List<String> stringList = new ArrayList<String>();
        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        Optional<String> reduced = stream.reduce((value, combinedValue) -> {
            return combinedValue +" "+ value;
        });
        System.out.println(reduced.get());

        //limit()
        //The Java Stream limit() method can limit the number of
        //elements in a stream to a number given to the limit() method
        //as parameter. The limit() method returns a new Stream which
        //will at most contain the given number of elements. Here is a Java Stream limit() example:
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("one");
        stringList1.add("two");
        stringList1.add("three");
        stringList1.add("one");
        Stream<String> stream1 = stringList1.stream();
        stream1
                .limit(2)
                .forEach( element -> { System.out.println(element); });


        //peek()
        //The Java Stream peek() method is a non-terminal operation that
        //takes a Consumer (java.util.function.Consumer) as parameter.
        //The Consumer will get called for each element in the stream.
        //The peek() method returns a new Stream which contains all the
        //elements in the original stream.

        //The purpose of the peek() method is, as the method says, to
        //peek at the elements in the stream, not to transform them.
        //Keep in mind that the peek method does not start the internal
        //iteration of the elements in the stream. You need to call a
        //terminal operation for that. Here is a Java Stream peek() example:
        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("abcefghig");
        stringList2.add("def");

        stringList2.stream()
                .filter(s->s.length()==3)
                .peek(System.out::println);


        // Java code for Stream allMatch
        // (Predicate predicate) to check whether
        // all elements of this stream match
        // the provided predicate.
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        // Check if all elements of stream
        // are divisible by 3 or not using
        // Stream allMatch(Predicate predicate)
        boolean answer = list.stream().allMatch(n-> n % 3 ==0);
        // Displaying the result
        System.out.println(answer);


        // Java code for Stream anyMatch
        // (Predicate predicate) to check whether
        // any element of this stream match
        // the provided predicate.
        // Creating a list of Integers
        List<Integer> list1 = Arrays.asList(3, 4, 6, 12, 20);
        // Stream anyMatch(Predicate predicate)
        boolean answer1 = list1.stream().anyMatch(n
                -> (n * (n + 1)) / 4 == 5);
        // Displaying the result
        System.out.println(answer1);


        // Java Program to Illustrate noneMatch() method
        // of Stream class to check whether
        // no elements of this stream match the
        // provided predicate (Predicate predicate)
        // Creating a Stream of strings
        // Custom input strings are passed as arguments
        Stream<String> stream2
                = Stream.of("CSE", "C++", "Java", "DS");

        // Now using Stream noneMatch(Predicate predicate)
        // and later storing the boolean answer as
        boolean answer2
                = stream2.noneMatch(str -> (str.length() == 4));

        // Printing the boolean value on the console
        System.out.println(answer2);


        //Range method
        IntStream intStream = IntStream.range(20, 30);
        intStream.forEach(System.out::println);

        // Creating an empty Stream
        Stream<Integer> stream3 = Stream.of(1,3,8);

        // Displaying elements in Stream
        stream3.forEach(System.out::println);

    }
}

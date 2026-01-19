package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        // What is stream ?
        // a sequence of elements supporting functional and declarative programing

        // How to use Streams ?
        // Source , intermediate operations & terminal operations

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        System.out.println( numbers.stream().filter(x->x%2==0).count());

        // Creating Streams
        // 1. From collections
        List <Integer> list=Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list.stream();
        // 2. From Arrays
        String [] arr={"a","b","c"};
        Stream<String>stream1=Arrays.stream(arr);

        // Using Stream.of()
        Stream<String>stream2=Stream.of("a","b");
        // 4. Infinite Streams
        Stream<Integer>gen=Stream.generate(()->1);
        List <Integer>collect=Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}

package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        // To take result from Streams
        List<Integer>list= Arrays.asList(1,2,3,4);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x-> System.out.println(x));

        // 3. reduce : Combines elements to produce a single result uses Binary Operator
       Optional<Integer> optionalInteger= list.stream().reduce((x, y)->x+y);
       // or can use method reference
        Optional<Integer> optionalIntegerM= list.stream().reduce(Integer::sum);
        System.out.println(optionalIntegerM.get());

        // 4. count

        // 5. anyMatch, allMatch, noneMatch
       boolean b= list.stream().anyMatch(x-> x%2==0);
        System.out.println(b);

        boolean b1=list.stream().allMatch(x-> x>0);
        System.out.println(b1);

        boolean b3=list.stream().noneMatch(x->x<0);
        System.out.println(b3);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst());
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());


        // Examples : Filtering and Collecting Names
        List<String> names=Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        // Example : Squaring and Sorting Numbers
        List<Integer>numbers=Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        // Example : Summing Values
        List<Integer> num=Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(num.stream().reduce((x,y)->x+y)); // without get
        System.out.println(num.stream().reduce(Integer::sum).get());

        // Example : Counting Occurrence of a CCharacter
        String sen="Hello World";
       char [] charArr= sen.toCharArray();
        System.out.println(sen.chars().filter(x->x=='l').count());

        // stateful & stateless operation
        // stateless - one at a time , example- map()
        // stateful - have to know about everything, like sorted()

        // 7. toArray()
        Object [] array= Stream.of(1,2,3).toArray();

        // 8. min / max
        System.out.println("max: "+ Stream.of(2,44,69).max(Comparator.naturalOrder()).get());
        System.out.println("min: "+ Stream.of(2,44,69).min(Comparator.naturalOrder()).get());
        // Using lambda expression and Comparator
        System.out.println("max: "+Stream.of(2,44,69).max((o1,o2)->o2-o1));

        // 9. forEachOrdered
         // using parallel stream , for ordering
        List<Integer> numbers0= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using forEach with parallel strteam: ");
        numbers0.parallelStream().forEach(System.out::println);
        // Now using forEachOrdered
        System.out.println(" Now Using forEachOrdered with parallel stream: ");
        numbers0.parallelStream().forEachOrdered(System.out::println);


        // Example
        // Stream cannot be reused after a terminal operation has been called
        Stream<String> stream=names.stream();
        stream.forEach(System.out::println);
       // List<String>list1=stream.map(String::toUpperCase).toList(); // exception







    }
}

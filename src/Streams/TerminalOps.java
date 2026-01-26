package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    }
}

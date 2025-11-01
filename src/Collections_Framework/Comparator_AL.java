package Collections_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();  // In descending order according to length
    }
}
class MyComparators implements  Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;  // In descending order
    }
}

public class Comparator_AL {
    public static void main(String[] args) {
        // Comparator is a interface through which we can do custom ordering
        // Compares 2 objects of same type and determine their order
        List<Integer> list=new ArrayList<>();
        list.add(167);
        list.add(9);
        list.add(33);
        list.add(5372);

        list.sort(new MyComparators());
         System.out.println(list);
        list.sort((a,b)-> b-a);
        list.forEach(sd -> System.out.println(sd));

        List<String> words=Arrays.asList("banana","kiwi","apple","grapes");
        // Used when we need to sort on basis of alphabetical order
        words.sort(new StringLengthComparator());
        System.out.println(words);
     // Using Lambda Expression
        List<String> lock=Arrays.asList("zebra","elephant","lion","horse");
        lock.sort((a,b)-> b.length()-a.length());
        System.out.println(lock);

        List<Integer> neck=Arrays.asList(1,2,3,45,566,32,212);
        neck.sort((c,d)-> d-c);
        System.out.println(neck);

    }
}

package Collections_Framework;

import java.util.SortedMap;
import java.util.TreeMap;
// Sorted Map is a interface , and Tree Map is it's implementation of (Navigable Map)
//Sorted Map extends Map
// It guarantees that the entries are sorted based on the keys, either in their natural ordering or by a specific constructor.
// Red Black tree (Self Balancing Binary Search Tree) --> logN Time Complexity
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap=new TreeMap<>((a,b)->b-a); // By Default, it is in ascending order
        sortedMap.put(91,"Vivek");
        sortedMap.put(99,"Shubham");
        sortedMap.put(78,"Mohit");
        sortedMap.put(88,"Vedaant");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(91));  // exclude
        System.out.println(sortedMap.tailMap(91));
        System.out.println(sortedMap.subMap(78,91));  // exclusive (For ascending order)
        System.out.println(sortedMap.subMap(91,78)); // exclusive(For descending order using Comparator)


    }
}

package Collections_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashmap=new LinkedHashMap<>(11, 0.3f, true);
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Apple",20);
        hashMap.put("Guava",30);

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }
        // Order is maintained in Linked Hash Map
        // In this a double linked list is present
        // Due to overhead it is a bit slow compared to Hash Map and consumes more memory
        // Linked Hash Map is not also Thread Safe
        linkedHashmap.put("Orange",10);
        linkedHashmap.put("Apple",20);
        linkedHashmap.put("Guava",30);
        // Default value of Access Order is False - for insertion order
        // True - For Access Order
        // When true it moves to the last the most recent used
        // It tells about least recently used
        linkedHashmap.get("Apple");
        System.out.println(linkedHashmap.get("Orange"));

        for(Map.Entry<String, Integer> entry: linkedHashmap.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }

        HashMap<String, Integer> hash=new HashMap<>();
        hash.put("Shubham",96);
        hash.put("Bob",89);
        hash.put("Sember",78);

        hash.putIfAbsent("Vedaant",94);
        System.out.println(hash);

        int res=hash.getOrDefault("Shubham",0);
        System.out.println(res);


    }
}

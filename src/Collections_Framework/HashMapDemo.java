package Collections_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Hash map has an internal array size, which by default is 16
        // By default the load factor is 0.75
        // Hash map provides constant time 0(1) performance for basic operations like put() and get()
        HashMap<Integer, String> map=new HashMap<>(17,0.5f);
        map.put(24,"Siddharth");
        map.put(1,"Vedaant");
        map.put(2,"Amrita");
        map.put(3,"Madhav");

        System.out.println(map);
        String student=map.get(3);
        System.out.println(student);
        String s=map.get(34);
        System.out.println(s);

        System.out.println(map.containsKey(24));
        System.out.println(map.containsValue("Vedaant"));

        // For accessing key values
        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }
        // For accessing both
        Set<Map.Entry<Integer, String>> entries =map.entrySet();

        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
            entry.setValue((entry.getValue().toUpperCase()));
        }
        System.out.println(map);

        System.out.println(map.containsValue("VEDAANT"));



    }
}

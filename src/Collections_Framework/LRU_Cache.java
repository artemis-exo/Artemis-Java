package Collections_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<K,V> extends LinkedHashMap<K,V> {
    // LRU Cache is a data structure that discards the least recently used items first when its storage capacity is full

    private int capacity;

    public LRU_Cache(int capacity){
        super(capacity,0.75f, true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
     LRU_Cache<String, Integer> studentMap=new LRU_Cache<>(3);
        studentMap.put("Bob",89);
        studentMap.put("Raman",99);
        studentMap.put("Cristie",92);
        studentMap.get("Bob");
        studentMap.put("Travis",85);

        System.out.println(studentMap);
    }
}

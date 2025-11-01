package Collections_Framework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
        // This will be different because identity hash code uses object
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        // This will be same because hash code checks the content only
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String,Integer>map=new IdentityHashMap<>();
        // Identity hash code and == method
        // It uses object and identity Hash code which will be different beacuse of use of new keyword
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(key1==(key2));  // will replace gives only one output in Hash Map it sees the content
        // will give false for == and true for equals as checks the content
        System.out.println(map);

    }
}

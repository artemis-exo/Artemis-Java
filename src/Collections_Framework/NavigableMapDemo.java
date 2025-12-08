package Collections_Framework;

import java.util.NavigableMap;
import java.util.TreeMap;
// Navigable Map extends the Sorted Map
// And it implements the Tree Map
public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nav=new TreeMap<>();
        nav.put(1,"One");
        nav.put(5,"Five");
        nav.put(3,"Three");

        System.out.println(nav);
        System.out.println(nav.lowerEntry(4));
        System.out.println(nav.ceilingEntry(3));
        System.out.println(nav.higherEntry(1));
    }
}

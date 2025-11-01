package Generics;

public class Pair_Main {
    public static void main(String[] args) {
        Pair<String,Integer>pair=new Pair<>("Vedaant",21);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}

/* T: Type
   E: Element (used in collections)
   K: Key (used in maps)
   V: Value(used in maps)
   N: Number
 */

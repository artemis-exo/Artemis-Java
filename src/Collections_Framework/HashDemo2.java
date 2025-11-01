package Collections_Framework;

import java.util.HashMap;

public class HashDemo2 {
    public static void main(String[] args) {
        // Since orange is stored in bucket 14, the HashMap handles the collision by adding "Grape" to the LinkedList in Bucket14
        // Now, bucket 14 contains two entries:
      //  ("Orange,80") and ("Grape",20)
        // It will use equals() method to traverse in a Linked list to find the output like if we want to get Grapes it will traverse
        HashMap<String, Integer> fruitMap=new HashMap<>();
        fruitMap.put("Apple",50);
        fruitMap.put("Banana",30);
        fruitMap.put("Grape",20);  // index=14
        fruitMap.put("Orange",80);  // index=14
        System.out.println(fruitMap.get("Grape"));
    }
}

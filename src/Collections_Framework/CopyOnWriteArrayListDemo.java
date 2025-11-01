package Collections_Framework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        //"Copy on Write" means that whenever a write operation
        // Like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it's being modified are unaffected.

        // Read operations: Fast and direct, since they happen ona stable List without interference from modifications
        // Write Operations: a new copy of the list is created for every modification.
        //              The reference to the last is then updated so that subsequent reads use this new list.
        // when read more and write less than we use CopyOnWriteArrayList

        List<String> shopping=new CopyOnWriteArrayList<>();
        shopping.add("Milk");
        shopping.add("Eggs");
        shopping.add("Bread");
        System.out.println("Initial Shopping List: "+ shopping);

        for(String item: shopping){
            System.out.println(item);
            // Try to modify the list while reading
            if(item.equals("Eggs")){  // if we use ArrayList instead of this it will display error in modification
                shopping.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        // purani= new
        System.out.println("Updated Shopping List: "+shopping);
    }
}

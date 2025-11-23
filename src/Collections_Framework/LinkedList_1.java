package Collections_Framework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        // Deletion is easier in Linked List
        LinkedList<Integer> LinkedList=new LinkedList<>();
        LinkedList.add(1);
        LinkedList.add(2);
        LinkedList.add(3);
        System.out.println(LinkedList.get(2));  // O(n)
        LinkedList.addLast(4);  // O(1)
        LinkedList.addFirst(0); // O(1)
        System.out.println(LinkedList.getLast());
        System.out.println(LinkedList.getFirst());
        System.out.println(LinkedList);
        LinkedList.removeIf(x-> x%2==0);
        System.out.println(LinkedList);

        // For creating on the Fly Linked List
        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat","Dog","Lion"));
        LinkedList<String>animalsToRemove= new LinkedList<>(Arrays.asList("Dog","Snake"));
        animals.removeAll(animalsToRemove);  // Removes which are as in animalToRemove
        System.out.println(animals);


    }
}

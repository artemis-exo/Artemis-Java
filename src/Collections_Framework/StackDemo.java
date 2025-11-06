package Collections_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack extends Vector, it is synchronized, making it thread safe
        // Stack follows LIFO principle, where the last element added is the first one to be get removed
        // Inheritance- Stack is a subclass of Vector, which means it inherits all the features of a dynamic array but is constrained by the stack's LIFO nature
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement=stack.pop();
        System.out.println(stack);
        Integer peek=stack.peek();
        System.out.println(peek);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search=stack.search(4);  // 1 based Indexing
        System.out.println(search);
        //4
        //3
        //2
        //1

        // linked list as Stack
        LinkedList<Integer> link=new LinkedList<>();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        System.out.println(link.isEmpty());
        System.out.println(link.getLast()); // peek
        System.out.println(link.removeLast());  // pop
        System.out.println(link.size());
        System.out.println(link.isEmpty());
        System.out.println(link);

        // Array List as Stack
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.get(arr.size()-1);  // peek
        arr.remove(arr.size()-1);   // pop



    }
}

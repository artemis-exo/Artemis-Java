package Collections_Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    // Legacy class in Java that implements the List interface
    // It is before from Collections Framework
    // It is Synchronized and Thread safe unlike ArrayList and linkedList
    // For Thread safety concern use Vector
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(4,2);
        // We can check Vector capacity in Vector Unlike ArrayList
        // Default initial Capacity is 10
        vector.add(0);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        // Here if the capacity is full the capacity becomes the double of the previous
        // Also has the capacity increament function to set the capacity if it is full to the desired capacity(+ previous)
        System.out.println(vector.capacity());
        LinkedList<Integer> LL=new LinkedList<>();
        LL.add(10);
        LL.add(20);
        LL.add(30);
        Vector<Integer> vector1=new Vector<>(LL);
        System.out.println(vector1);

        for(int i=0; i<vector1.size();i++){
            System.out.println(vector1.get(i));
        }
        vector1.clear();
        System.out.println(vector1);
        // Proving why ArrayList is not thread safe
        ArrayList<Integer> list=new ArrayList<>();
        Thread t1=new Thread(()-> {
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        Thread t2=new Thread(()-> {
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list " + list.size());  //  Expected Output: 2000
        // This proves ArrayList is not Thread Safe

       // Proving that Vector is thread safe
        Vector<Integer> list1=new Vector<>();
        Thread t3=new Thread(()-> {
            for(int i=0;i<1000;i++){
                list1.add(i);
            }
        });
        Thread t4=new Thread(()-> {
            for(int i=0;i<1000;i++){
                list1.add(i);
            }
        });

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list " + list1.size());
    }
}

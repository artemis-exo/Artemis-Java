package MultiThreading;

public class Synchronization {
    private int count=0;

    public  void increament(){// Make sure that only one method can access it at one time and second one is waiting
        synchronized (this) {  // or can do this also synchronized block can be accessed by one thread at a time
            count++;    // part of program where shared resources are accessed and identified is called critical section
        }  // Mutual exclusion ensures that multiple Threads cannot access the critical section.
    }
    public int getCount(){
        return count;
    }

}

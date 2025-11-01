package MultiThreading;

public class World extends Thread {
    @Override
    public void run() {
        for(; ;){  // Infinite loop
            System.out.println("World");
        }
    }
}

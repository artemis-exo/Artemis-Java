package MultiThreading;

public class World_imp implements Runnable {
    @Override
    public void run() {
        for(; ;){
            System.out.println("World");
        }

    }
}

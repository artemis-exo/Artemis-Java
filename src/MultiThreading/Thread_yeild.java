package MultiThreading;

public class Thread_yeild extends Thread{
    public Thread_yeild(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+ "is running");
            Thread.yield();  // Giving hint to the scheduler that the current thread wants to give chance to the other threads
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_yeild t1=new Thread_yeild("t1");
        Thread_yeild t2=new Thread_yeild("t2");
        t1.start();
        t2.start();

    }
    // User Threads -usual work done by Threads
    // Daemon threads - runs in background

}

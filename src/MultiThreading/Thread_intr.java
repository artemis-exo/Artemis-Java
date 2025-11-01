package MultiThreading;

public class Thread_intr extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running......");
        }catch(InterruptedException e){
            System.out.println("Thread interrupted: "+e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_intr t1=new Thread_intr();
        t1.start();
        t1.interrupt();  // stops the execution of the try block
    }
}

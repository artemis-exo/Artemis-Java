import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
   private AtomicInteger counter =new AtomicInteger(0);

   public void increament(){
       counter.incrementAndGet();  // Not Atomic even though counter is volatile

   }

   public int getCounter(){
       return counter.get();

   }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc=new VolatileCounter();
        Thread t1=new Thread(()->{
            for(int i=0; i<1000; i++){
                vc.increament();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0; i<1000;i++){
                vc.increament();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(vc.getCounter());
    }
}

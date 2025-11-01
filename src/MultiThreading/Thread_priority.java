package MultiThreading;
// To change the Thread name  we have to generate it's constructor
// We can set the priority of the thread by ourselves using setPriority


public class Thread_priority extends Thread {
    public Thread_priority(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            String a="";
            for(int j=0; j<10000;j++){
                a+="a";
            }
            System.out.println(Thread.currentThread().getName() + "- Priority: "+ Thread.currentThread().getPriority() + "- count: "+i);
            try{
                Thread.sleep(100);
            } catch(Exception e){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_priority t1= new Thread_priority("LOW PRIORITY THREAD");
        Thread_priority t2= new Thread_priority("MEDIUM PRIORITY THREAD");
        Thread_priority t3= new Thread_priority("HIGH PRIORITY THREAD");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();



    }
}

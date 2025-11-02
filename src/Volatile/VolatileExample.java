package Volatile;

class SharedObj{
    private volatile boolean flag=false;

    public void setFlagTrue(){
        System.out.println("Flag is true now");
        flag=true;
    }
    public void printFlagTrue(){
        while(!flag){
            // do nothing
        }
        System.out.println("Writer thread made the Flag true!");
    }
}
public class VolatileExample {
    public static void main(String[] args) {
        SharedObj share=new SharedObj();

        Thread writerThread=new Thread(()->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            share.setFlagTrue();
        });

        Thread readerThread=new Thread(()-> share.printFlagTrue());

        writerThread.start();
        readerThread.start();

    }
}

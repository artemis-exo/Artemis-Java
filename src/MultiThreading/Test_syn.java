package MultiThreading;

public class Test_syn {
    public static void main(String[] args) {
        Synchronization syn=new Synchronization();
        Syno_thread t1=new Syno_thread(syn);
        Syno_thread t2=new Syno_thread(syn);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println(syn.getCount());   // giving incorrect results because data is sharing (Without Synchronized)
    }
}

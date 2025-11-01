package MultiThreading;

public class Syno_thread extends Thread {
    private Synchronization syn;

    public Syno_thread(Synchronization syn){
        this.syn=syn;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            syn.increament();
        }
    }
}

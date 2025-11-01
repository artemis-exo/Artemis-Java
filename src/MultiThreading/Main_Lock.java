package MultiThreading;
// This is related to Banking_lock
public class Main_Lock {
    public static void main(String[] args) {
        BankAccoount_locks sbi=new BankAccoount_locks();
        Runnable task =new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(60);
            }
        };
        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}

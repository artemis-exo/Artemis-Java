package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccoount_locks {

    private int balance=100;

    private Lock lock= new ReentrantLock();

    public  void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+ "attempting to withdraw" + amount);
        try{
            if(lock.tryLock(6000, TimeUnit.MILLISECONDS)){
                if(balance>= amount) {
                    try{
                    System.out.println(Thread.currentThread().getName() + "proceeding with withdraw");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + "completed withdrawal. Remaining balance: " + balance);
                } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
            }
            else{
                    System.out.println(Thread.currentThread().getName()+ "insufficient balance");
                }
        } else{
                System.out.println(Thread.currentThread().getName()+ "could not acquire the lock, will try again later");
            }
        } catch(Exception e){
           Thread.currentThread().interrupt();
        }


    }
}

package Encapsulation;

public class BankAccount {
    private double balance;
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}

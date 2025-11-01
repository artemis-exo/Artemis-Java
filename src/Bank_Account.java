public class Bank_Account {
    private long accountmumber;   // ACCESS MODIFIERS
    private int balance;         // ACCESS MODIFIERS

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("DEPOSITED "+amount);
        }
        else{
            System.out.println("INVALID DEPOSIT AMOUNT");
        }
    }
    public void withdraw (double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("WITHDREW "+amount);
        }
        else{
            System.out.println("INVALID AMOUNT OR INSUFFICIENT BALANCE");
        }

    }

    public long getAccountmumber() {
        return accountmumber;
    }

    public void setAccountmumber(long accountmumber) {
        this.accountmumber = accountmumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

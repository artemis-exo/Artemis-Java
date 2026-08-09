package Encapsulation;

public class MainTest {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.deposit(13838);
        bank.withdraw(328);
        System.out.println(bank.getBalance());
        // For Student Class
        Student st=new Student("Vedaant",178,22,"USCS");
        System.out.println(st.getName());
        System.out.println(st.getRollNo());
        System.out.println(st.getAge());
        System.out.println(st.getCollege());
        st.setName("Amrita");
        System.out.println(st.getName());
        System.out.println(st.getRollNo());
        System.out.println(st.getAge());
        System.out.println(st.getCollege());

    }
}

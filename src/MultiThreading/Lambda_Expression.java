package MultiThreading;

public class Lambda_Expression {
    public static void main(String[] args) {


        Runnable runnable = new Runnable() {   // Anonymous class
            @Override
            public void run() {
                System.out.println("Hello");

            }
        };
        Thread t1 = new Thread(runnable);

    }
}


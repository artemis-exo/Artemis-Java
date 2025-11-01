package MultiThreading;
// No requirement of implementation class can be created directly
public class LambdaExpression {
    public static void main(String[] args) {
        Thread t1=new Thread(()-> {
            for(int i=0; i<10;i++){
                System.out.println("Hello");
            }
        });
        int a=1;
        Runnable task =() -> {
            for(int i=0; i<10;i++){
                System.out.println("Hello");
            }
        };
        t1.start();
    }
}

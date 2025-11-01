package MultiThreading;

public class Hello_imp {
    public static void main(String[] args) {
        World_imp worldi=new World_imp();
        Thread t1=new Thread(worldi);
        t1.start();

        for(; ;){
            System.out.println("Hello");
        }
    }
}

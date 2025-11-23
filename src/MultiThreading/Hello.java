package MultiThreading;

public class Hello {
    public static void main(String[] args) {
        World world=new World();  //NEW STATE
        world.start();  // RUNNABLE
//        for(; ;) {
           System.out.println("Hello");
//        }
    }
}

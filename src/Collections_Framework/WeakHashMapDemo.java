package Collections_Framework;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache=new WeakHashMap<>();
        // img 1 and img 2 are stored as literal in String constant pool so they are strong reference
        // And hence cannot be cleared by garbage collector
//        imageCache.put("img1",new Image("Image 1"));
//        imageCache.put("img2",new Image("Image 2"));


        imageCache.put(new String("img1"), new Image("Image 1"));
        imageCache.put(new String("img2"), new Image("Image 2"));

        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared)" + imageCache);

    }
    private static void simulateApplicationRunning(){
        try {
            System.out.println("Simulating application running..");
            Thread.sleep(5000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Image{
    
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

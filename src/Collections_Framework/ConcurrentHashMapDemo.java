package Collections_Framework;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap <String,Integer> map=new ConcurrentHashMap<>();
        // Java 7 --> segment based locking ---> 16 segments ---> smaller hashMaps
        // Only the segment being written to or read from is locked
        // read : do not require locking unless there is a write operation happening on the same segment
        // write : lock

        // java 8 ---> no segmentation
        //        ---> Compare and Swap approach ---> no locking except resizing or collision
    }
}

package Collections_Framework;

public class Hash_same_out {
    public static void main(String[] args) {
        // In collision the Linked List helps to create output of two same input
        // They are stored in a linked list inside the bucket
        // We uses Balanced Binary search tree (RB Tree) to nullify the excess collision and the time complexity of 0(N)
        // RB Tree uses 0(log n)
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));

    }
    public static int simpleHash(String keys){
        int sum=0;
        for(char c: keys.toCharArray()){
            sum+=(int)c;
        }
        return sum;
    }
}

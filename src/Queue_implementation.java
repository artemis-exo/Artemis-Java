class Queue{
   private int maxSize;
   private int front,rear;
   private int [] queue;

   public Queue(int size){
       maxSize=size;
       front =0;
       rear=-1;
       queue= new int[maxSize];
   }
   public void Enqueue(int val){
       if(rear==maxSize-1){
           System.out.println("Queue is full");
       }
       else{
           queue[++rear]=val;
           System.out.println(val+" is Enqueued ");
       }
   }
   public int Dequeue(){
       if(front>rear){
           System.out.println("Queue is empty");
           return -1;
       }
       else{
           return queue[front++];
       }
   }
   public int peek(){
       if(front>rear){
           System.out.println("Queue is empty");
           return -1;
       }
       else{
           return queue[front];
       }
   }
   public void display(){
       if(front>rear){
           System.out.println("Queue is empty");
       }
       else{
           System.out.println("The elements of Queue are: ");
           for(int i=front;i<=rear;i++){
               System.out.print(queue[i]+ " ");
           }
           System.out.println();
       }
   }

}
public class Queue_implementation {
    public static void main(String[] args) {
        Queue qui=new Queue(5);
        qui.Enqueue(10);
        qui.Enqueue(20);
        qui.Enqueue(30);
        qui.display();
        System.out.println("The Dequeued element is : "+ qui.Dequeue());
        System.out.println("The peeked element is : "+qui.peek());
        qui.display();

    }
}

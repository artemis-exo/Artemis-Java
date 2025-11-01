class Circular_Queue{
    int [] Circular;
    int front;
    int rear;
   int capacity;
   int size;

   public Circular_Queue(int capacity){
       this.capacity=capacity;
     front =-1;
     rear=-1;
     size=0;
     Circular=new int[capacity];
   }
   boolean isFull(){
       return (size==capacity);
   }
   boolean isEmpty(){
       return(size==0);
   }
   void enqueue(int data){
       if(isFull()){
           System.out.println("Queue is full! Cannot insert"+ data);
           return;
       }
       if(front ==-1){
           front =0;
       }
       rear=(rear+1)%capacity;
       Circular[rear]=data;
       size++;
       System.out.println(data +"inserted");
   }
   int dequeue(){
       if(isEmpty()){
           System.out.println("Queue is empty! Cannot be dequeued");
           return -1;
       }
       int res=Circular[front];
       if(front == rear){
           front=rear=-1;
       }
       else{
           front=(front+1)%capacity;
       }
       size--;
       return res;
   }
   int peek(){
       if(isEmpty()){
           System.out.println("Queue is empty! Cannot be dequeued");
           return -1;
       }
       return Circular[front];
   }
   void display(){
       if(isEmpty()){
           System.out.println("Queue is empty! Cannot be dequeued");
           return;
       }
       System.out.println("The elements of queue are :");
       int i=front;
       while(true){
           System.out.print(Circular[i]+" ");
           if(i==rear)
               break;
           i=(i+1)%capacity;
       }
       System.out.println();
   }

}

public class CircularQueue_implementation {
    public static void main(String[] args) {
        Circular_Queue circle=new Circular_Queue(5);

        circle.enqueue(10);
        circle.enqueue(20);
        circle.enqueue(30);
        circle.enqueue(40);
        circle.enqueue(50);

        circle.display();
        System.out.println("Dequeued element is "+ circle.dequeue());
        circle.enqueue(60);

        circle.display();
        System.out.println("Peek:"+circle.peek());

    }
}

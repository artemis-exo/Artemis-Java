package Stack_Queue;

class Stacks{
    private int top;
   private int [] stackie;
   private int maxSize;

    public Stacks(int size){
        maxSize=size;
        stackie=new int[maxSize];
         top=-1;
    }
    public void push(int val){
        if(top==maxSize-1){
            System.out.println("Stack is full");
        }
        else{
            stackie[++top]=val;
            System.out.println(val+" is pushed to the stack");
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else
            return stackie[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stackie[top];
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The elements of stack are:");
            for(int i=0; i<=top;i++){
                System.out.print(stackie[i]+ " ");
            }
            System.out.println();
        }
    }
}

public class Stack_implementation {
    public static void main(String[] args) {
        Stacks stock=new Stacks(5);
        stock.push(10);
        stock.push(20);
        stock.push(30);
        stock.display();
        System.out.println("Popped elemnts is :"+stock.pop());
        System.out.println("Peeked element is :"+stock.peek());
        stock.display();


    }
}

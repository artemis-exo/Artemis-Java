package LinkedKist_Imp;

class Nodes{
    int data;
    Nodes next;
public Nodes(int data){
    this.data=data;
    this.next=null;
}
}
class Singly{
    Nodes head;

    public void end(int data){
        Nodes newNode=new Nodes(data);
        if(head==null){
            head=newNode;
            return;
        }
        Nodes current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void front(int data){
        Nodes newNode=new Nodes(data);
        newNode.next=head;
        head=newNode;
    }

    public void delete(int key){
        Nodes current=head;
        Nodes prev=null;
        if(current!=null && current.data==key){
            head=current.next;
            return;
        }
        while(current!=null && current.data!=key){
            prev=current;
            current=current.next;
        }
        if(current==null) return;
        // Doing the unlinking
        prev.next=current.next;
    }
    public void display(){
        Nodes current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current =current.next;
        }
        System.out.println("Null");

    }
}
public class SingleLinkedList_imple {
    public static void main(String[] args) {
        Singly sing=new Singly();
        sing.end(10);
        sing.end(20);
        sing.end(30);

        System.out.println("Initial List.");
        sing.display();
        sing.front(5);
        System.out.println("After inserting 5 at beginning:");
        sing.display();
        System.out.println("After inserting 40 at the end ");
        sing.end(40);
        sing.display();
        System.out.println("After deleting the desired element ");
        sing .delete(20);
        sing.display();

    }
}

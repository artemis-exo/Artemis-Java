package LinkedKist_Imp;

class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}

class Circular{
    Node head;
    public void Front(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            head.prev=head;
            head.next=head;
            return;
        }
        Node last=head.prev;
        newNode.prev=last;
        newNode.next=head;

        head.prev=newNode;
        last.next=newNode;
        head=newNode;
    }
    public void End(int val){
        Node newNode =new Node(val);
        if(head==null){
            head=newNode;
            head.prev=head;
            head.next=head;
            return;
        }
        Node last=head.prev;
        last.next=newNode;
        newNode.next=head;
        newNode.prev=last;
        head.prev=newNode;

    }
    // Insert after a given position (insert in middle)
    void insert(int val, int pos) {
        if (head == null) {
            System.out.println("List is empty. Adding as first node.");
            End(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        int count = 1;

        while (count < pos && temp.next != head) {
            temp = temp.next;
            count++;
        }

        Node nextNode = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = nextNode;
        nextNode.prev = newNode;
    }
    void delete(int key){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.val!=key){
            if(temp.next==head){
                System.out.println("Node not found");
                return;
            }
            temp=temp.next;
        }
        if(temp.next==head && temp.prev==head){
            head=null;
            return;
        }
        if(temp==head){
            Node last=head.prev;
            head=head.next;
            head.prev=last;
            last.next=head;
        }
        else{
            temp.next.prev=temp.prev;
            temp.prev.next=temp.next;
        }
    }
    void display(){
        Node temp=head;
        System.out.println("The linked list is : ");
        do{
            System.out.print(temp.val+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println();
    }
}
public class CircularDoubleLinked {
    public static void main(String[] args) {
    Circular c=new Circular();
        c.End(10);
        c.End(20);
        c.End(30);
        c.display();
        c.Front(5);
        c.display();
        c.delete(20);
        c.display();
        c.insert(15,2);
        c.display();
    }
}

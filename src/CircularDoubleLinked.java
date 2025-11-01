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
    public void insertFront(int val){
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
    }
    public void insertEnd(int val){
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
    void insertAtPos(int val, int pos) {
        if (head == null) {
            System.out.println("List is empty. Adding as first node.");
            insertEnd(val);
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

}
public class CircularDoubleLinked {
    public static void main(String[] args) {

    }
}

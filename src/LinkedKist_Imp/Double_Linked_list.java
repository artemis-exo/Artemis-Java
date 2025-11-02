package LinkedKist_Imp;

class Nodi{
    int val;
    Nodi next;
    Nodi prev;
    Nodi(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class Doubliey{
    Nodi head;
    public void end(int val){
        Nodi newNode=new Nodi(val);
        if(head==null){
            head=newNode;
            return;
        }
        Nodi temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    public void front(int val){
        Nodi newNode=new Nodi(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void delete(int key){
        Nodi temp =head;
        if(temp!=null && temp.val==key){
            head=temp.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        while(temp!=null && temp.val!=key){
            temp=temp.next;
        }
        if(temp==null)
            return;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }

    }
    public void displayfront(){
        Nodi temp=head;
        System.out.print("Forward:");
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayback(){
        Nodi temp=head;
        if(temp==null)
        return;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.print("Backward:");
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp=temp.prev;
        }
        System.out.println();
    }
}
public class Double_Linked_list{
    public static void main(String[] args) {
        Doubliey doll=new Doubliey();
        doll.end(10);
        doll.end(20);
        doll.end(30);
        doll.front(5);

        doll.displayfront();
        doll.displayback();
        System.out.print("After deleting the desired element from ");
        doll.delete(20);
        doll.displayfront();
    }
}
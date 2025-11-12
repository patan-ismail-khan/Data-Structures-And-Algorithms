
public class LinkedListQueue {
    static Node head=null,tail=null;
    static class Queue{
        void add(int val){
            Node n = new Node (val);
            if(head==null){
                head=n;
                tail = head;
                return;
            }
            tail.next=n;
            tail=n;

        }

        int remove(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
            int deleted = head.data;
            head=head.next;
            return deleted;
        }

        int peek(){
               if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
            
            return head.data;
        }

        void display(){
            if(head==null){
                System.out.println("queue is empty");
                return;
            }
            Node temp = head;
            while (temp!=null) {

                System.out.print(temp.data+" ");
                temp=temp.next;
                
            }

        }


        
    }


    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.add(5);
        Q.add(10);
        Q.add(15);
        Q.display();
        Q.remove();
        Q.display();
        Q.remove();
        Q.remove();
        Q.remove();
    }
    
}
class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

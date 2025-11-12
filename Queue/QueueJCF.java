import java.util.*;
public class QueueJCF {

    //in JCF Queue exists as an Interface
    //so we use other data structures like LiNKEDLIST and ArrayDeque to implement queue
    



    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        q.add(5);
        q.add(15);
        q.add(25);
        System.out.println(q.peek());            
    
    }
}

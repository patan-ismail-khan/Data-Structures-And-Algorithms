/*A queue is given as 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 (which is even size)
  we have to convert it into a queue as 
     1 ,6 ,2 ,7 ,3 ,8 ,4 , 9 ,5 ,10
 */
import java.util.*;
public class Interleave2HalfsOfQueue {
    public static void interleave2halfs(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        int mid=q.size()/2;
        for(int i=1;i<=mid;i++){
            q1.add(q.remove());

        }
        while (!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);

        interleave2halfs(q);
        System.out.println(q);
        

        
    }
    
}

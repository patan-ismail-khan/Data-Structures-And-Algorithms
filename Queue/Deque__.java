import java.util.*;
public class Deque__ {
    /*this a queue in which we can access the elements in a queue from front and rear
  this is called as double ended queue
  deque is an interface so we use LinkedList data structure to implement deque
 */


    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(5);
        dq.addLast(10);
        dq.add(15);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
    

}

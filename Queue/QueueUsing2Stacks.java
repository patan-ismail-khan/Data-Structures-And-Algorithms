import java.util.*;
public class QueueUsing2Stacks {
    static class queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        void add(int val){
            while(!s1.isEmpty()){
                s2.push(s1.pop());

            }
            s2.push(val);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();

        }

        int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();

        }

        


    }
    public static void main(String[] args) {

        queue q = new queue();
        q.add(0);
        q.add(5);
        q.add(15);
        System.out.println(q.peek());
        
    }
    
}

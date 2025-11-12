
public class CircularQueue {
    static int arr[];
    static int front,rear;
    static int size=5;
    static class cQueue{
        cQueue(){
            arr = new int[size];
            front=-1;
            rear=-1;
            
        }
        void add(int val){
            if(front==(rear+1)%size){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=val;



        }
        int remove(){
            if(front==-1&&rear==-1){
                System.out.println("queue is empty");
                return -1;
            }
            int deleted = arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
                return deleted;
            }
            front=(front+1)%size;
            return deleted;

        }

        int peek(){
            if(front==-1){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
        

    }
    public static void main(String[] args) {
        cQueue Q = new cQueue();
        Q.add(5);
        Q.add(10);
        Q.add(15);
        System.out.println(Q.peek());


    }
    
}


public class ArrayQueue {
    static int front = -1,rear = -1;
    static int arr[]= new int[10];
    public void add(int val){
        if(rear==arr.length-1){
            System.out.println("queue full");
            return;
        }
        if(front==-1){
            front=0;

        }
        rear++;
        arr[rear]=val;


    }

    public int remove(){
        if(rear==-1){
            System.out.println("empty queue");
            front--;
            return -1;
        }
        for(int i=front+1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        
        return arr[rear--];
    }

    public int peek(){
        if(rear==-1){
            System.out.println("no queue");
            return -1;
        }
        return arr[front];
    } 

    public void display(){
        if(rear==-1){
            System.out.println("empty queue");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.add(5);
        q.add(10);
        q.add(15);
        q.remove();
        System.out.println(q.peek());
        q.display();
    }

   
}


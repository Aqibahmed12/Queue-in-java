public class QueueArray {
    int size;
    int front = -1;
    int rear = -1;
    int arr[];
    
    
    QueueArray(int size){ 
        this.size = size;
        this.arr = new int[size];
    }
    
    
    boolean isEmpty(){
        return front == -1;
    }
    
    int peek(){
        return arr[front];
    }
    
    boolean isFull(){
        return rear == size -1;
    }
    
    
    void enQueue(int n){
        if(isEmpty()){
            arr[++front] = arr[++rear] = n;
        }else{
            if(isFull()){
                System.out.println("Queue is full");
            }else{
                arr[++rear] = n;
            }
        }
    }
    
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return 0;
        }
        int temp = arr[front++];
        if(front>=rear){
            front = rear = -1;
        }
        return temp;
    }
    
    
    void traverse(){
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
      QueueArray qa = new QueueArray(5);
      qa.enQueue(2);
      qa.enQueue(3);
      qa.enQueue(4);
      qa.enQueue(5);
      qa.enQueue(6);
      qa.traverse();
      System.out.println();
      System.out.println("Delete: "+qa.deQueue());
      qa.traverse();
      System.out.println();
      System.out.println("peek: "+ qa.peek());
      
    }
    
}







































































/**
 opi4kpo1k2r
 **/
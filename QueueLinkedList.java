public class QueueLinkedList {
    public class Node{
       int value; 
       Node next;
       
        Node(int data){       
            this.value=data;
            this.next=null;
        }
    }
    private Node rear;
    private Node front;

    public QueueLinkedList() {
        this.front=null;
        this.rear=null;
    }
  
    public void Enqueue(int value){
        Node newnode=new Node(value);
        if(front==null){
            rear=front=newnode;
        }
        rear.next=newnode;
        rear=newnode;
    }
  
  
    public int Dequeue(){
        if(front==null){   
            System.out.println("Your queue is already null");
        }
        
        int temp=front.value;
        front=front.next;
        return temp;
    }
    
    
    public void display(){
        
        if(front==null){
            return;
        }
        Node current=front;  
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }   
    }
    
    
    public int peek(){
        return front.value;
    }
    
    public boolean isempty(){
        return front==null;
    }
    
    public static void main(String[] args){
        QueueLinkedList q1=new QueueLinkedList();
        q1.Enqueue(10);
        q1.Enqueue(20);
        q1.Enqueue(30);
        q1.display();
        System.out.println("deleted value: "+q1.Dequeue());
        q1.display();
        System.out.println("deleted value: "+q1.Dequeue());
        System.out.println("peek value: "+q1.peek());
        q1.display();
        System.out.println(q1.isempty());
    }
}

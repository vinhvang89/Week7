package LinkedList_QueueCircular;

public class QueueLinked {
    Node front;
    Node rear;
    public QueueLinked(){
        this.front = null;
        this.rear = null;
    }
    private class Node{
        Node link;
        int data;
        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }
    public void enqueue(int data){
        Node temp = new Node(data);
        if( this.rear == null ){
            this.front = temp;
        } else
            this.rear.link = temp;
        this.rear = temp;
        this.rear.link = this.front;
    }
    public int  dequeue(){
        if(this.front == null) {
            System.out.println("THis queue is empty");
            return Integer.MIN_VALUE;
        }
        else {
            int value ;
            if(this.front == this.rear) {
                value = this.front.data;
                this.rear = null;
                this.front = null;
            } else {
                Node temp = this.front;
                value = temp.data;
                this.front = this.front.link;
                this.rear.link = this.front;
            }
            return value;
        }
    }
    public void display(){
        Node temp = this.front;
        System.out.println("Elements in circular queue are : ");
        while (temp.link != this.front ){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}

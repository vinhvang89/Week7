package LinkedList_QueueSimple;
public class QueueList {
    Node head;
    Node tail;

    public QueueList() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        Node next;
        String type;
        public Node(String type){
            this.next = null;
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
    }
    public void enqueue(String type){
        Node temp = new Node(type);
        if(this.tail == null)
            this.head = this.tail = temp;
        else
            this.tail.next = temp;
        this.tail = temp;
        this.tail.next = null;
    }
    public String dequeue(){
        if(this.head == null)
            return "This is empty queue ";
        else {
            String data;
            Node temp = this.head;
            data = temp.type;
            this.head = this.head.next;
            System.out.println("Dequeue : " + data);
            return data;
        }
    }
    public void display(){
        Node temp = this.head;
        while (temp.next != null){
            System.out.println(temp.type);
            temp = temp.next;
        }
        System.out.println(temp.type);
    }
}

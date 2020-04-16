package LinkedList_StackSimple;

public class StackLinked {
    private Node front;
    public StackLinked(){
        this.front = null;
    }
    private static class Node{
        Node link;
        String data;
        public Node(String data){
            this.link = null;
            this.data = data;
        }
    }
    public void enqueue(String data){
        Node temp;
        if( this.front == null)
                this.front  = new Node(data);
        else {
            temp = this.front;
            this.front = new Node(data);
            this.front.link = temp;
        }
    }
    public String dequeue(){
        if(this.front == null)
            return "This is empty stack ";
        else {
            String data;
            data = this.front.data;
            this.front = this.front.link;
            return data;
        }
    }
    public void display(){
        Node temp = this.front;
        while (temp.link != null){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }


}

package LinkedList_Queue;

public class QueueLinkedTest {
    public static void main(String[] args) {
        QueueLinked circle = new QueueLinked();
        circle.enqueue(30);
        circle.enqueue(21);
        circle.enqueue(22);
        circle.dequeue();
        circle.dequeue();
        circle.enqueue(99);
        circle.display();
    }
}

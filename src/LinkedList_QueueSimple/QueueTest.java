package LinkedList_QueueSimple;

public class QueueTest {
    public static void main(String[] args) {
        QueueList queue = new QueueList();
        queue.enqueue(14);
        queue.enqueue(22);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(12);
        queue.enqueue(14);
        queue.dequeue();
        System.out.println("Dequeue item is :" +queue.dequeue().key);
    }
}

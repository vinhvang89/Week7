package LinkedList_QueueSimple;

public class QueueTest {
    public static void main(String[] args) {
        QueueList strings = new QueueList();
        strings.enqueue("We");
        strings.enqueue("are");
        strings.enqueue("the");
        strings.enqueue("self-appointment");
        strings.enqueue("Champion");
        strings.dequeue();
        strings.dequeue();
        strings.enqueue("Whom");
        strings.enqueue("is");
        strings.enqueue("he ?");
        strings.display();
    }
}

package LinkedList_StackSimple;

public class StackTest {
    public static void main(String[] args) {
        StackLinked strings = new StackLinked();
        strings.enqueue("Hello");
        strings.enqueue("everybody");
        strings.enqueue("I");
        strings.enqueue("am");
        strings.enqueue("the");
        strings.enqueue("King");
        strings.dequeue();
        strings.enqueue("Trash");
        strings.display();
    }
}

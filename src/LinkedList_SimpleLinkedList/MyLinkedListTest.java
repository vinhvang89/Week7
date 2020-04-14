package LinkedList_SimpleLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(22);
        ll.addFirst(8);
        ll.addFirst(89);

        ll.add(3,19);
        ll.add(2,"abc");
        ll.printList();

    }
}

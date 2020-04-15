package Queue_Array;

import java.util.Arrays;

public class QueueArrayTest {
    public static void main(String[] args) {
        QueueArray array = new QueueArray(4);
        array.enqueue(30);
        array.enqueue(42);
        array.enqueue(18);
        array.enqueue(26);
        array.dequeue();
        array.dequeue();
        array.dequeue();
        array.enqueue(4);
        array.enqueue(8);
        array.dequeue();
        array.dequeue();
        System.out.println(Arrays.toString(array.Array));
        System.out.println(array.dequeue());

    }
}

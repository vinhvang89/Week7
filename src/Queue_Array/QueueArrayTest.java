package Queue_Array;

import java.util.Arrays;

public class QueueArrayTest {
    public static void main(String[] args) {
        QueueArray array = new QueueArray(4);
        array.enqueue(3);
        array.enqueue(6);
        array.enqueue(8);
        array.dequeue();
        array.dequeue();
        array.dequeue();
        System.out.println(Arrays.toString(array.Array));
        System.out.println(array.dequeue());

    }
}

package Queue_Array;

public class QueueArray {
    private int head = 0;
    private int tail = -1;
    private int capacity;
    private int currentSize;
    public int Array[];

    public QueueArray(int capacity) {
        this.capacity = capacity;
        Array = new int[this.capacity];
    }

    private boolean isQueueFull() {
        return currentSize == capacity;
    }

    private boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int value) {
        if (isQueueFull())
            System.out.println("This queue is full , cant add " + value);
        else {
            tail++;
            if (tail == capacity - 1) {
                Array[tail] = value;
                tail = 0;
            } else
                Array[tail] = value;
            currentSize++;
        }
    }

    public int dequeue() {
        int[] temp = new int[capacity];
        int a;
        int j = 0;
        if (isQueueEmpty())
            throw new ArrayIndexOutOfBoundsException("This Array is empty");
        else {
            a = Array[head];
            for (int i = 0; i < Array.length; i++) {
                if (i != head) {
                    temp[j] = Array[i];
                    j++;
                }
            }
            Array = temp;
            currentSize--;
            return a;
        }

    }
}



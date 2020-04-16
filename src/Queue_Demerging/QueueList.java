package Queue_Demerging;

import java.util.Arrays;

public class QueueList {
    private int head = 0;
    private int tail = -1;
    private Employee[] array;
    private int size ;
    public QueueList (int size){
        this.size = size;
        array = new Employee[this.size];
    }
    private void ensureSize(){
        int newSize = size*2;
        if( tail == size -1)
            array = Arrays.copyOf(array,newSize);
    }
    private boolean isEmpty(){
        return tail == -1;
    }
    public void enqueue(Employee employee){
        ensureSize();
        tail++;
        array[tail] = employee;
    }
    public void dequeue(QueueList output){
        int j = 0;
        Employee[] temp = new Employee[array.length];
        if(isEmpty())
            System.out.println("This queue is empty");
        else {
            output.enqueue(array[head]);
            for (int i = 1; i < array.length ; i++) {
                temp[j] = array[i];
                j++;
            }
            tail--;
            array = temp;
        }
    }
    public void sortByAge(){
        Employee temp = array[0];
        for (int i = 0; i < tail -1 ; i++) {
            for (int j = i + 1;j<tail;j++){
                if(array[i].getAge()> array[j].getAge())
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
            }
        }
    }
    public int getTail(){
        return  tail;
    }
    public Employee[] getArray(){
        return array;
    }

}

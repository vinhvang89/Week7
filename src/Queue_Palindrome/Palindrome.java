package Queue_Palindrome;

import java.util.Arrays;

public class Palindrome {
    private int head = 0;
    private int tail = -1;
    private char[] array;
    private int capacity;
    public Palindrome(int capacity ){
        this.capacity = capacity;
        array = new char[this.capacity];
    }
    private void ensureCapacity(){
        int new_capacity = this.capacity*2;
        if (tail == capacity -1)
            array = Arrays.copyOf(array,new_capacity);
    }
    private boolean isEmpty(){
        return tail == -1;
    }
    public void enqueue(char element){
        ensureCapacity();
        tail++;
        array[tail] = element;
    }
    public char dequeue() throws Exception{
        char temp;
        int j = 0;
        char[] temps = new char[capacity];
        if(isEmpty())
            throw new Exception("This queue is empty");
        else {
            System.out.println("Dequeue " + array[head]);
            temp = array[head];
             for (int i = 0; i < array.length; i++) {
                if (i != head) {
                    temps[j] = array[i];
                    j++;
                }
            }
             array = temps;
             tail--;
             return temp;
        }

    }
    public boolean isPalindrome(){
        int count = 0;
        int j = 0;
        for (int i = tail; i >= 0 ; i--) {
                if(array[i]==array[j])
                    count++;
                j++;
        }
        if(count == j)
            return true;
        else
            return false;
    }
    public char[] getArray(){
        return this.array;
    }


}

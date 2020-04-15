package Stack_ReseverIntArray;

public class MyStack {
    private int index = 0;
    private int[] array;
    private  int size;
    public MyStack(int size){
        this.size = size;
        array = new int[this.size];
    }
    private boolean isEmpty(){
        return index == 0;
    }
    private boolean isFull(){
        return index == size -1;
    }
    public void push(int element){
        if(isFull())
            System.out.println("Array is full");
        array[index] = element;
        index++;
    }
    public int pop() throws Exception{
        if (isEmpty())
             throw  new Exception("Array is empty");
        return array[index--];
    }
    public void reserveArray(){
        int[] temp = new int[this.size];
        int j = 0;
        for(int i = index - 1;i > 0 ; i--){
            temp[j] = array[i];
            j++;
        }
        array = temp;
    }
    public int[] getArray(){
        return this.array;
    }


}

package Stack_Array;

public class MyStack {
    private int index = 0;
    public int[] array;
    private int size;
    public MyStack( int size){
        this.size = size;
        array = new int[this.size];
    }
    private boolean isEmpty(){
        return index == 0;
    }
    private boolean isFull(){
        return index == size - 1;
    }
    public void push(int element){
        if(isFull())
            throw new StackOverflowError("Đầy con mẹ nó rồi ");
        array[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Làm đéo gì có gì mà ném");
        }
        array[index]= 0;
       return array[index--];
    }

}

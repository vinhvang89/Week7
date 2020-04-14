package ArrayList_Practice;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private Object[] elements;
    public MyList(){
        capacity = DEFAULT_CAPACITY;
        elements = new Object[capacity];
    }
    public MyList(int capacity) {
       this.capacity = capacity;
        elements = new Object[capacity];
    }

    public void ensureCapacity(){
        int new_capacity = this.capacity*2;
        elements = Arrays.copyOf(elements,new_capacity);
    }
    public void add(E element){
        if(this.size == capacity )
            ensureCapacity();
        elements[size++] = element;
    }
    public void addIndex(int index,E element){
        Object[] temp_elements = new Object[elements.length];
        int j = 0;
        if( index < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                if (i != index) {
                    temp_elements[j] = elements[i];
                } else {
                    temp_elements[j] = element;
                }
                j++;
            }
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Quá con mẹ nó phần tử mảng rồi , ok");
        }
        elements = temp_elements;
    }
    public void remove(int index){
        Object[] temp_elements = new Object[this.capacity];
        int j = 0;
        if( index >= 0 && index < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                if (i != index) {
                    temp_elements[j] = elements[i];
                    j++;
                }
                elements = temp_elements;
            }
        } else
            throw new ArrayIndexOutOfBoundsException("Làm méo gì có phần tử ấy trong mảng mà xóa");
    }
    public Object clone(){
        MyList<E> MyList_Replica = new MyList<>();
        MyList_Replica.elements = this.elements;
        MyList_Replica.size = this.size;
       return MyList_Replica;
    }
    public boolean contain(E what){
        for (Object element : elements) {
            if (element == what) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E what){
        int count = 0;
        for (Object element : elements) {
            count++;
            if (element == what) {
                return count ;
            }
        }
        return count = -1;
    }
    public E get(int i){
        if ( i >= 0 && i < elements.length)
            return (E) elements[i];
        else
            throw new ArrayIndexOutOfBoundsException("Đéo có phần tử thứ "+i+" trong cái mảng này đâu");
    }
    public void clear(){
        Object[] clear = new Object[this.capacity];
        elements = clear;
    }
    public Object[] getArray(){
        return  elements;
    }

}

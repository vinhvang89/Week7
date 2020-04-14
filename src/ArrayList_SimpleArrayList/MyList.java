package ArrayList_SimpleArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    final private int DEFAULT_CAPACITY = 10;
    protected Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length)
            ensureCapacity();
        elements[size++] = e;
    }
    public E get(int i){
        if( i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: "+i+" ,size "+i);
        }
        return (E) elements[i];
    }

}

package LinkedList_Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;
    public Stack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public T pop(){
        if(isEmpty())
            throw new EmptyStackException();
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

}
package Stack_ChechBracket;

import java.util.Arrays;

public class Expression {
    private int index = 0;
    private char[] array;
    private int size;
    public Expression(int size){
        this.size = size;
        array = new char[this.size];
    }
    private void ensureSize(){
        int new_size = this.size*2;
        if(index == size -1)
            array = Arrays.copyOf(array,new_size);
    }
    private boolean isEmpty(){
        return index == 0;
    }
    public void push(char element){
        ensureSize();
        array[index]= element;
        index++;
    }
    public void pop(){
        if(isEmpty())
            System.out.println("This stack is empty");
        else {
            array[index] = ' ';
            index--;
        }
    }
    public boolean isExpression(){
        int countLeftBracket = 0;
        int countRightBracket = 0;
        for (int i = 0; i <= index && i + 1 <= index ; i++) {
            if(array[i] == '(' && array[i+1] ==')')
                return false;
            if(array[i] == '(')
                countLeftBracket++;
            if(array[i]== ')')
                countRightBracket++;
        }
        if( countLeftBracket == countRightBracket)
            return  true;
        else
            return false;
    }
}

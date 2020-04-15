package Stack_Array;

import java.util.Arrays;

public class MyStackTest {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(80);
        stack.push(10);
        stack.push(830);
        stack.push(801);
        stack.pop();
        stack.push(500);
        System.out.println(stack.pop());
        System.out.println (Arrays.toString(stack.array));
    }
}

package Stack_ReseverIntArray;

import java.util.Arrays;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myInt = new MyStack(8);
        myInt.push(12);
        myInt.push(36);
        myInt.push(122);
        myInt.push(112);
        myInt.push(129);
        myInt.reserveArray();


        System.out.println(Arrays.toString(myInt.getArray()));
    }
}

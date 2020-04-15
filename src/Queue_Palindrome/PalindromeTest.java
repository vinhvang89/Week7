package Queue_Palindrome;

import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) throws Exception {
        Words words = new Words(8);
        words.enqueue('a');
        words.enqueue('n');
        words.enqueue('n');
        words.enqueue('a');
        words.enqueue('c');
        System.out.println(words.isPalindrome());
        System.out.println(Arrays.toString(words.getArray()));

    }
}

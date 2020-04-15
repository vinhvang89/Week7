package Queue_Palindrome;

import java.util.Arrays;

public class PalindromeTest {
    public static void main(String[] args) throws Exception {
        Palindrome palindrome = new Palindrome(8);
        palindrome.enqueue('a');
        palindrome.enqueue('n');
        palindrome.enqueue('n');
        palindrome.enqueue('a');
        palindrome.enqueue('c');
        System.out.println(palindrome.isPalindrome());
        System.out.println(Arrays.toString(palindrome.getArray()));

    }
}

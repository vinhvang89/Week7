package AutomatedTest_FizzBuzz;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test with 12")
    public void testWith12() {
        FizzBuzz test = new FizzBuzz(12);
        String result = test.toString();
        String expected = "Fizz";
        assertTrue(result.equals(expected));
    }

    @Test
    @DisplayName("Test with 45")
    public void testWith45() {
        FizzBuzz test = new FizzBuzz(45);
        String result = test.toString();
        String expected = "FizzBuzz";
        assertTrue(result.equals(expected));
    }
    @Test
    @DisplayName("Test with 8")
    public void testWith8(){
        FizzBuzz test = new FizzBuzz(8);
        String result = test.toString();
        String expected = "Aloha";
        assertTrue(result.equals(expected));
    }
    @Test
    @DisplayName("Test with 35")
    public void testWith35(){
        FizzBuzz test = new FizzBuzz(35);
        String result = test.toString();
        String expected = "Buzz";
        assertTrue(result.equals(expected));
    }
}


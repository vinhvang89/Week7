package AutomatedTesting_AsoluteNumberCalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Test as 0 ")
    public void testFindAbsoloteOf0(){
        int x = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.getAbsoluteNumber(x);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("Test as 1")
    public void testFindAbsoluteOf1(){
        int x = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.getAbsoluteNumber(x);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test as -1")
    public  void tesFindAbsoluteOf_1(){
        int x = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.getAbsoluteNumber(x);
        assertEquals(expected,result);
    }
}

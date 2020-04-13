package AutomatedTest_TriangleClassifier;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Test triangle with 4 8 19")
    public void testTriangleWith4_8_19(){
        int side1 = 4;
        int side2 = 8;
        int side3 = 19;
        String result = Triangle.classify(side1,side2,side3);
        String expected = "It is not a triangle";
        assertTrue(result.equals(expected));
    }
    @Test
    @DisplayName("Test triangle with 5 5 5")
    public void testTriangleWith5_5_5(){
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;
        String result = Triangle.classify(side1,side2,side3);
        String expected = "It is equilateral triangle";
        assertTrue(result.equals(expected));
    }
    @Test
    @DisplayName("Test triangle with 5 8 8")
    public void testTriangleWith5_8_8(){
        int side1 = 5;
        int side2 = 8;
        int side3 = 8;
        String result = Triangle.classify(side1,side2,side3);
        String expected = "It is isosceles triangle";
        assertTrue(result.equals(expected));
    }
    @Test
    @DisplayName("Test triangle with 6 7 11")
    public void testTriangleWith6_7_11() {
        int side1 = 6;
        int side2 = 7;
        int side3 = 11;
        String result = Triangle.classify(side1, side2, side3);
        String expected = "It is normal triangle ";
        assertTrue(result.equals(expected));
    }
}

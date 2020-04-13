package AutomatedTesting_NextDayCalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("Test 29-02-2020")
    public void nextDayOf29_2_2020(){
        int day = 29;
        int month = 2;
        int year = 2020;
        int expected_day = 1;
        int expected_month = 3;
        int expected_year = 2020;
        NextDayCalculator.getNextDay(29,2,2020);
        assertEquals(expected_day,NextDayCalculator.getDay1());
        assertEquals(expected_month,NextDayCalculator.getMonth1());
        assertEquals(expected_year,NextDayCalculator.getYear1());
    }
    @Test
    @DisplayName("Test 31-12-1792")
    public void nextDayOf31_12_1792(){
        int day = 31;
        int month = 12;
        int year = 1792;
        int expected_day = 1;
        int expected_month = 1;
        int expected_year = 1793;
        NextDayCalculator.getNextDay(31,12,1792);
        assertEquals(expected_day,NextDayCalculator.getDay1());
        assertEquals(expected_month,NextDayCalculator.getMonth1());
        assertEquals(expected_year,NextDayCalculator.getYear1());
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void test4Paths() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertFalse(LeapYear.isLeapYear(2100));
        assertTrue(LeapYear.isLeapYear(1984));
        assertFalse(LeapYear.isLeapYear(1987));
    }


}
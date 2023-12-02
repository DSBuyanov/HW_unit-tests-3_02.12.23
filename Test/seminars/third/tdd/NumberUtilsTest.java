package seminars.third.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void isEvenTrueForEvenNumbers() {
        assertTrue(NumberUtils.isEven(2));
        assertTrue(NumberUtils.isEven(4));
    }

    @Test
    void isEvenFalseForOddNumbers() {
        assertFalse(NumberUtils.isEven(1));
        assertFalse(NumberUtils.isEven(3));
    }

    @Test
    void isInIntervalTrueForNumbersInInterval() {
        assertTrue(NumberUtils.isInInterval(26));
        assertTrue(NumberUtils.isInInterval(50));
    }

    @Test
    void isInIntervalFalseForNumbersOutsideInterval() {
        assertFalse(NumberUtils.isInInterval(25));
        assertFalse(NumberUtils.isInInterval(100));
        assertFalse(NumberUtils.isInInterval(10));
    }
}

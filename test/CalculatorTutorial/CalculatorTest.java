package CalculatorTutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testSum() {
        assertEquals(4, calculator.sum(2, 2));
        assertEquals(0, calculator.sum(0, 0));
    }

    @Test
    void testMinus() {
        assertEquals(1, calculator.minus(3, 2));
        assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculator.divide(2, 2));
        assertEquals(0, calculator.divide(0, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(0, calculator.multiply(0, 2));
    }
}
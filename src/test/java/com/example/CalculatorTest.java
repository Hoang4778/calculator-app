package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("2 + 3 = 5")
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    @DisplayName("2 - 3 = -1")
    void testSubtract() {
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    @DisplayName("2 * 3 = 6")
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    @DisplayName("6 / 3 = 2.0")
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3), 1e-9);
    }

    @Test
    @DisplayName("divide by zero throws")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }
}

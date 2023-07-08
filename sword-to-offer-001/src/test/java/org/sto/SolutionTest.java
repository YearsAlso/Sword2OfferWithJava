package org.sto;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void divide() {
        Solution solution = new Solution();
        assertEquals(2, solution.divide(4, 2));
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        Solution solution = new Solution();
        assertThrows(IllegalArgumentException.class, () -> {
            solution.divide(4, 0);
        });
    }

    @org.junit.jupiter.api.Test
    void divide2() {
        Solution solution = new Solution();
        assertEquals(2147483647, solution.divide(-2147483648, -1));
        assertEquals(2147483647, solution.divide(2147483647, 1));
        assertEquals(-2147483648, solution.divide(-2147483648, 1));
    }
}
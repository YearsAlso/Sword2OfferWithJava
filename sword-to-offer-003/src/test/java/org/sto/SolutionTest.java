package org.sto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countBits() {
        Solution solution = new Solution();

        int[] actual = solution.countBits(5);
        System.out.printf("actual: %s%n", (Object) actual);
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, actual);
        assertArrayEquals(new int[]{0}, solution.countBits(0));
        assertArrayEquals(new int[]{0, 1}, solution.countBits(1));
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
    }

    @Test
    void countBitSimple() {
        Solution solution = new Solution();

        assertEquals(2, solution.countBitSimple(3));
        assertEquals(1, solution.countBitSimple(2));
        assertEquals(1, solution.countBitSimple(1));
        assertEquals(0, solution.countBitSimple(0));
    }
}
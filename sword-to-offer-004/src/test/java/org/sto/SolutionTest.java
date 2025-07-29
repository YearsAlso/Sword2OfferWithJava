package org.sto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber() {
        Solution solution = new Solution();

        assertEquals(1, solution.singleNumber(new int[]{2, 2, 2, 1}));
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2, 1, 2}));
    }
}
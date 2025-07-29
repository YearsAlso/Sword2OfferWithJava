package org.sto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        Solution solution = new Solution();

        assertEquals(16, solution.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
        assertEquals(4, solution.maxProduct(new String[]{"a","ab","abc","d","cd","bcd","abcd"}));
    }
}
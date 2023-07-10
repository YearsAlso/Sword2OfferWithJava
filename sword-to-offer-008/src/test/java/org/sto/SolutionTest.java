package org.sto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minSubArrayLen1() {
        Solution solution = new Solution();

        assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));

    }

    @Test
    void minSubArrayLen2() {
        Solution solution = new Solution();

        assertEquals(1, solution.minSubArrayLen(4, new int[]{1, 4, 4}));


    }

    @Test
    void minSubArrayLen3() {
        Solution solution = new Solution();


        assertEquals(0, solution.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));

    }

    @Test
    void failedExample1() {
        Solution solution = new Solution();

        // 边界条件判断有问题，对于遍历的深度，应该是数组的长度，而不是数组的长度减1
        assertEquals(5, solution.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void failedExample2() {
        Solution solution = new Solution();

        // 没有仔细审题，要求是大于等于target的最短子数组，而不是等于target的最短子数组
        assertEquals(2, solution.minSubArrayLen(20, new int[]{2, 16, 14, 15}));
    }


    @Test
    void failedExample3() {
        Solution solution = new Solution();

        // 没有仔细审题，要求是大于等于target的最短子数组，而不是等于target的最短子数组
        assertEquals(8, solution.minSubArrayLen(213, new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12}));
    }

}
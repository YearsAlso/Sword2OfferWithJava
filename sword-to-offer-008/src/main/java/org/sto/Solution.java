package org.sto;

import java.util.*;

/***
 * 剑指 Offer II 008. 和大于等于 target 的最短子数组
 * 中等
 * 119
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */
public class Solution {
    // 求数组和
    public int getSum(int[] nums, int head, int tail) {
        int sum = 0;
        String result = "";
        for (int i = head; i <= tail; i++) {
            sum += nums[i];
            result += nums[i] + ",";
        }

        System.out.println(result + " = " + sum);
        return sum;
    }

    // 由于是连续子数组，所以可以使用双指针法
    // 但是这个方法有问题，没有考虑到数组中有负数的情况
    // 如果只是每次删除最小的元素，可能会删除一个负数，导致最终的和反而变大了
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int head = 0;
        int tail = nums.length - 1;

        int minSum = getSum(nums, head, tail);

        // 如果数组中有一个元素大于等于target，那么最短子数组的长度就是1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return 1;
            }
        }


        System.out.println(target);
        while (minSum > target && head < tail) {
            if (nums[head] <= nums[tail]) {
                head += 1;
            } else {
                tail -= 1;
            }

            minSum = getSum(nums, head, tail);
        }


        System.out.println("head = " + head + ", tail = " + tail);
        if (tail == nums.length - 1 && minSum < target) {
            return 0;
        }
        return head == tail ? 0 : tail - head + 1;
    }
}

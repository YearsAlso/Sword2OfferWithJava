package org.sto;

/**
 * 剑指 Offer II 003. 前 n 个数字二进制中 1 的个数
 * 给定一个非负整数 n ，请计算 0 到 n 之间的每个数字的二进制表示中 1 的个数，并输出一个数组。
 */
public class Solution {

    public  int countBitSimple(int n) {
        int result = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                result++;
            }
            n = n >> 1;
        }
        return result;
    }


    // 注意临界问题，循环的时候是 <= n
    public int[] countBits(int n) {
        if (n == 0) {
            return new int[]{0};
        }

        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countBitSimple(i);
        }

        return result;
    }
}

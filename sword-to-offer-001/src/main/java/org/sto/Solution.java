package org.sto;

/***
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
 *
 *
 * 注意：
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8以及 truncate(-2.7335) = -2
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231, 231−1]。本题中，如果除法结果溢出，则返回 231 − 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/xoh6Oh
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    // 本题难度不大，主要是审题，第二点
    // 如果直接判断 a,b 可以判断出输出结果，但是这样程序不具有通用性，还是使用转换类型比较适合
    public int divide(int a, int b) {
        if (a == 0) {
            return 0;
        }

        if (b == 0) {
            throw new IllegalArgumentException("b cannot be zero");
        }

        long result = (long) a / b;

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return (int) (result - 1);
        }

        return (int) result;
    }
}

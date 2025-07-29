package org.sto;

import java.util.HashMap;
import java.util.Map;

/***
 * 剑指 Offer II 006. 排序数组中两个数字之和
 * 简单
 * 70
 * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0 开始计数 ，所以答案数组应当满足 0 <= answer[0] < answer[1] < numbers.length 。
 * 假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> subMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            if(subMap.containsKey(target - numbers[i])) {
                return new int[]{subMap.get(target - numbers[i]), i};
            }
            subMap.put(numbers[i], i);
        }

        return new int[]{};
    }
}

package org.sto;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer II 004. 只出现一次的数字
 * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 */
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length < 1) {
            throw new IllegalArgumentException("nums is empty");
        }
        List<Integer> history = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                list.remove(Integer.valueOf(nums[i]));
                history.add(nums[i]);
            } else {
                if (!history.contains(nums[i])) {
                    list.add(nums[i]);
                } else {
                    history.add(nums[i]);
                }
            }
        }
        return list.get(0);
    }
}

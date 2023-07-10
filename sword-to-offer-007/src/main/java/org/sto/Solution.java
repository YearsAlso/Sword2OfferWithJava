package org.sto;

import java.util.*;


/***
 * 剑指 Offer II 007. 数组中和为 0 的三个数
 * 中等
 * 119
 * 相关企业
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * 你返回所有和为 0 且不重复的三元组。
 */
class Solution {

    // 怎么去除重复的三元组？
    // 优化遍历的过程，避免重复的三元组
    // 所以这还是一个搜索的问题
    // 如果先排序，那么就不需要每次对三个数进行排序了

    // 但是这个方法超时了
    // 需要将三重循环优化为两重循环

    // 但是这个方法还是超时了
    // 加入了两个跳过重复的判断，但是还是超时了

    // 那怎么办呢？
    // 是不是可以考虑优化排序，或者优化查找的过程呢？

    // 添加一个历史记录，记录已经查找过的三元组

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[0]);
                list.add(nums[1]);
                list.add(nums[2]);

                result.add(list);
            }

            return result;
        }

        // 先排序
        Arrays.sort(nums);

        // 如果使用一个map来存储，那么就需要考虑重复的问题
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        Map<String,Boolean> historyMap = new HashMap<>();

        // 三重递归对比
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (historyMap.containsKey(nums[i] + "," + nums[j])) {
                    continue;
                }

                int target = 0 - nums[i] - nums[j];
                if (indexMap.containsKey(target) && indexMap.get(target) > j) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(target);

                    if (!result.contains(list)) {
                        historyMap.put(nums[i] + "," + nums[j], true);
                        if(target > nums[j]){
                            historyMap.put(nums[j] + "," + target, true);
                        }else{
                            historyMap.put(target + "," + nums[j], true);
                        }

                        if(target > nums[i]){
                            historyMap.put(nums[i] + "," + target, true);
                        }else{
                            historyMap.put(target + "," + nums[i], true);
                        }
                        result.add(list);
                    }
                }
            }
        }


        return result;
    }
}
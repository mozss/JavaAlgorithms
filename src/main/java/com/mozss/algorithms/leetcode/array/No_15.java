package com.mozss.leetcode.array;

/**
 * @author mozss
 * @create 2019-09-06 16:24
 */
/*
* 15.三数之和
* 给定一个包含n个整数的数组nums，判断nums中是否存在三个元素，a,b,c,使得使得 a + b + c = 0 ？
* 注意：答案中不可以包含重复的三元组。
例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，

满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
* */
/*public class No_15 {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                //跳过可能重复的答案
                int l = i + 1,r = nums.length - 1;sum = 0 -nums[i];

                while (l < r){
                    if (nums[1] + nums[r] == sum){
                       ls.add










                    }
                }

            }
        }
}
}

*/
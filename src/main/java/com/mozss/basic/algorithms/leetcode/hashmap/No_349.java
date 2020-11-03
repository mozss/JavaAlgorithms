package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mozss
 * @create 2019-09-06 11:01
 */
/*
 * 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集
 *
 * 示例1：
 * 输入：nums1 = [1,2,2,1],nums2 = [2,2]
 * 输出：[2]
 *
 * 示例2：
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 * 说明：
 * 输出结果中的每个元素一定是唯一的；
 * 我们不考虑输出结果的顺序
 * */
public class No_349 {
    //两个set去重配合使用
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> parentsSet = new HashSet<>();
        Set<Integer> childSet = new HashSet<>();
        for (int num : nums1) {
            parentsSet.add(num);
        }
        for (int num : nums2) {
            if (parentsSet.contains(num)) {
                childSet.add(num);
            }
        }
        int[] resArr = new int[childSet.size()];
        int index = 0;
        for (int value : childSet) {
            resArr[index++] = value;
        }
        return resArr;
    }
}

package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;
/**
 * @author mozss
 * @create 2019-09-06 11:01
 */
public class No349 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目名称:   349.两个数组的交集
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   给定两个数组，编写一个函数来计算它们的交集
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * @输入Input:    nums1 = [1,2,2,1] nums2 = [9,4,9,8,4]
     * @输出Output:   [2]
     * eg 2>:
     * @输入Input:    nums1= [4,9,5] nums2 = [9,4,9,8,4]
     * @输出Output:   [9,4]
     *
     * @说明:     输出结果中的每个元素是唯一的;我们不考虑输出结果的顺序性。
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:   两个set配合使用去重
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
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

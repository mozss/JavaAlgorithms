package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-06 8:14
 */
public class No167 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   167.两数之和为自然数
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定一个按照升序排列的有序数组,找到两个数使得它们相加之和等于自然数
     *             函数应该返回这两个下标index1 和 index2,其中index1 必须小于inder2
     *
     *             说明：
     *              返回的下标值（index1和index2)不是从零开始的
     *              你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    number = [2,7,11,15], target = 9
     * 输出Output:    [1,2]
     * 说明:         2与7之和等于目标数9,因此index1 = 1,index2 = 2
     *
     * eg 2>:
     * 输入Input:
     * 输出Output:
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int j = numbers.length - 1;
        int i = 0;
        while (j > i) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                index[0] = i + 1;
                index[1] = j + 1;
                break;
            }
        }
        return index;
    }
}

package com.mozss.basic.algorithms.leetcode.array;

import java.util.Arrays;

/**
 * @author: mozss
 * @date: 2020/11/4 23:36
 **/
public class No4 {
    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *
     * 题目编号: 04
     * 题目名称: 寻找两个有序数组的中位数
     * 知识考察: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述: 给定两个大小为m和n的有序数组，nums1和nums2，请找出这两个有序数组的中位数。
     * 并且要求算法的时间复杂度为O(log(m+n))
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 输入Input:
     * 输出Output: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:
     * 题目总结: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 8, 21};
        int[] nums2 = {2, 6, 9, 11, 23, 34};
        No4 no4 = new No4();
        double nums = no4.findMedianSortedArrays(nums1, nums2);
        System.out.println(nums);
    }

    /*
     * System提供了一个静态方法arraycopy(),我们可以使用它来实现数组之间的复制
     *
     * public static void arraycopy(Object src,int srcPoc,Object dest,int destPos,int length)
     *      src:源数组
     *      srcPos:源数组要复制的起始位置；
     *
     *      dest:目标数组
     *      destPos:目标数组复制的起始位置；
     *
     *      length:复制的长度。
     * 注意：src 和 dest都必须是同类型或者是可以相互转换的数组
     * */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        int a = nums.length % 2, b = nums.length / 2;
        double num = 0;
        if (a != 0) {
            num = nums[b];
        } else {
            num = (nums[b] + nums[b - 1] * 0.5);
        }
        return num;
    }
}

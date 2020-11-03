package com.mozss.basic.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-06 7:52
 */

/*
 * 我们把符合下列属性的数组A成为山脉
 *  A.length >= 3;
 *  存在0 < i < A.length - 1 使得A[0] < A[1] <...< A[i-1] < A[i] > A[i+1] > ...> A[A.length-1]
 *  给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i -1] < A[i] > A[i + 1] >...>A[A.length-1]的i的值
 *
 * 示例1：
 * 输入：[0,1,0]
 * 输出：1
 *
 * 示例2：
 * 输入：[0,2,1,0]
 * 输出：1
 *
 * 提示：
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A是如上定义的山峰
 * */

public class No_852 {
    public int peakIndexInMountainArray(int[] A) {
        int r = 0, l = A.length, mid = 0;
        while (r < 1) {
            mid = (r + 1) / 2;
            if (A[mid - 1] < A[mid]) {
                if (A[mid - 1] < A[mid]) {
                    return mid;
                }
                r = mid;
            } else {
                l = mid;
            }
        }
        return mid;
    }


}

package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-06 7:52
 */

public class No852 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目名称:   852.确定山峰的位置
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   我们把符合下列属性的数组A称为山脉
     *             A.length >= 3;
     *             存在0 < i < A.length - 1 使得A[0] < A[1] < ... < A[i-1] < A[i] > A[i+1] > ...> A[A.length-1]
     *             给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i -1]
     *              < A[i] > A[i + 1] >...>A[A.length-1]的i的值
     *
     *              提示:(A是如上定义的山峰)
     *                  3 <= A.length <= 10000
     *                  0 <= A[i] <= 10 ^ 6
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * @输入Input:    [0,1,0]
     * @输出Output:   1
     * @说明:
     *
     * eg 2>:
     * @输入Input:    [0,2,1,0]
     * @输出Output:   1
     * @说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
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

package com.mozss.basic.algorithms.leetcode.dynamicplanning;

/**
 * @author mozss
 * @create 2019-09-04 21:50
 */

public class No338 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目名称:   338.计算二进制中1的个数
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   给定一个非负数num. 对于0 <= i <= num 范围中的每个数字i, 计算其二进制中1的个数
     *             并将它们作为数组返回.
     *
     *             进阶:给定时间复杂度O(n*sizeof(integer))的解答会很容易.但你可以在线性时间O(n)
     *                  内用一趟扫描做到吗?
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * @输入Input:    2
     * @输出Output:   [0,1,1]
     * @说明:
     *
     * eg 2>:
     * @输入Input:    5
     * @输出Output:   [0,1,1,2,1,2]
     * @说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
    public int[] countBits(int intNum) {
        int[] res = new int[intNum + 1];
        for (int i = 1; 1 < intNum; i++) {
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }
}

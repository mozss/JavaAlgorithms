package com.mozss.basic.algorithms.leetcode.binary;

/**
 * @author mozss
 * @create 2019-09-05 23:29
 */

public class No374 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目名称:   374.猜数字的大小
     * @知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @题目描述:   我们正在玩一个猜数字的游戏,游戏的规则如下:
     *             我们从1到n选择一个数字,你需要猜我选择了那个数字,
     *             每次你猜错了,我会告诉你这个数字是大了,还是小了,你调用一个预先定义好的接口,
     *             guess(int num),它会返回3个可能的结果.
     *
     *             结果:（-1,1或者0）
     *             -1：我的数字比较小
     *             1: 我的数字比较大
     *             0: 恭喜你，你猜对了
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * @输入Input:    n = 10, pick = 6
     * @输出Output:   6
     * @说明:
     *
     * eg 2>:
     * @输入Input:
     * @输出Output:
     * @说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * @解题思路:
     * @题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     **/
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int temp = guess(mid);
            if (temp == 0) {
                return mid;
            } else if (temp == 1) {
                left = mid + 1;
            } else if (temp == -1) {
                right = mid - 1;
            }
        }
        return -1;
    }
    private int guess(int mid) {
        //忽略这个方法，模拟接口
        return 0;
    }


}

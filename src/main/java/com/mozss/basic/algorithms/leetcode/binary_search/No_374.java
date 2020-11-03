package com.mozss.basic.algorithms.leetcode.binary_search;

/**
 * @author mozss
 * @create 2019-09-05 23:29
 */

/*
 *
 *我们正在玩一个猜数字的游戏，游戏规则如下：
 *我们从1到n选择一个数字，你需要猜我选择了哪个数字，
 *每次你猜错了，我会告诉你这个数字是大了，还是小了，你调用一个预先定义好的接口，guess(int num),它会返回3个可能的结果。
 * （-1,1或者0）
 *-1：我的数字比较小
 * 1: 我的数字比较大
 * 0: 恭喜你，你猜对了
 *
 * 示例：
 * 输入：n = 10, pick = 6
 * 输出：6
 *
 *
 * */
public class No_374 {
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

package com.mozss.algorithms.offer;
/*
 * 在一个长度为n的数组里面，所有的数字都在0到n-1的范围里面，在数组中的某些数字是重复的，但不知道有几个重复的数字，
 * 也不知道每个数字重复几次，请找出其中的任意一个重复的数字。
 * */

/*
 * 长度为n，元素的数值范围为n，如果没有重复的元素，那么数组的下标对应的值与下标相同
 *
 * 从头到尾遍历数组，当扫描到下标i的数字nums[i]：
 *   1.如果等于i，继续往下扫描；
 *   2.如果不等于i，拿它与nums[i]个数进行对比。如果相等，说明有重复，返回nums[i]。如果不相等，就把第i个数和
 *     nums[i]个数交换。重复这个比较交换的过程。
 *   此算法时间复杂度为O(n),因为每个元素最多只要交换两次，就能确定位置，空间的复杂度为O(1)
 * */

import java.util.Arrays;

public class No3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 2, 5};
        int res = new No3().findDuplicate(arr);
        System.out.println(res);
    }

    public int findDuplicate(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    return array[i];
                }
                swap(array, i, array[i]);
                System.out.println(Arrays.toString(array));
            }
        }
        return -1;
    }

    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}

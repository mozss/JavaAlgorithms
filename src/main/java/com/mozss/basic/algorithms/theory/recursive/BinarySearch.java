package com.mozss.basic.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 13:58
 */
/*
 * 有序序列的二分查找（注意是有序序列）
 *
 * 在有序数组array[]中，不断将数组的中间值（mid）和被查找的值进行比较，如果被查找的值等于array[mid]，就返回下标mid；否则，就就查找
 * 范围缩小一半。如果被查找的值小于array[mid]，就继续在左半边查找，如果被查找的值大于array[mid],就继续在右边查找，直到查找到该值
 * 或者查找范围为空时，查找结束。
 * */
public class BinarySearch {
    /*
     * 1.使用循环来解决
     * */
    public static int BinarySearchByCycle(int[] array, int key) {
        int start = 0;
        int last = array.length - 1;
        while (start <= last) {
            //防止直接相加造成int范围溢出
            int mid = (last - start) / 2 + start;
            if (key == array[mid]) {
                return mid;
            }
            if (key > array[mid]) {
                start = mid + 1;
            }
            if (key < array[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }

    /*
     * 2.使用递归来解决
     * */
    public static int BinarySearchByRecurisive(int[] array, int key, int start, int last) {
        int mid = (last - start) / 2 + start;
        if (key == array[mid]) {
            return mid;
        }
        if (key > array[mid]) {
            return BinarySearchByRecurisive(array, key, mid + 1, last);
        }
        if (key < array[mid]) {
            return BinarySearchByRecurisive(array, key, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {2, 12, 24, 35, 56, 67, 78, 34, 46};
        int m = 24;
//        System.out.println(BinarySearchByCycle(n,m));
        System.out.println(BinarySearchByRecurisive(n, m, 0, 9));
    }


}

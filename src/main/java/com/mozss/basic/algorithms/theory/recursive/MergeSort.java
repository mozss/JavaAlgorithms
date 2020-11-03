package com.mozss.basic.algorithms.theory.recursive;

import java.util.Arrays;

/**
 * @author mozss
 * @create 2019-11-08 14:33
 */
/*
 * 归并排序的问题
 * */
public class MergeSort {
    /*
     * 使用递归来合并两个有序数组
     * */
    public static int[] MergeSortByCycle(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aNum = 0, bNum = 0, cNum = 0;
        while (aNum < a.length && bNum < b.length) {
            if (a[aNum] >= b[bNum]) {
                c[cNum++] = b[bNum++];
            } else {
                c[cNum++] = a[aNum++];
            }
        }
        //如果a数组全部到了c数组，但是b仍然有数据，则将b数组的剩余数据按照顺序全部复制到c
        while (aNum == a.length && bNum < b.length) {
            c[cNum++] = b[bNum++];
        }
        //如果b数组全部到了c数组，但是a仍然有数据，则将a数组的剩余数据按照顺序全部复制到c
        while (bNum == b.length && aNum < a.length) {
            c[cNum++] = a[aNum++];
        }
        return c;
    }

    public static int[] MergeSortByRecurisive(int[] c, int start, int last) {
        if (last > start) {
            int mid = start + (last - start) / 2;
            MergeSortByRecurisive(c, start, mid);
            MergeSortByRecurisive(c, mid + 1, last);
            merge(c, start, mid, last);
        }
        return c;
    }

    /*
     * 使用非递归来实现归并排序
     * */
    private static void merge(int[] c, int start, int mid, int last) {
        //定义临时数组
        int[] temp = new int[last - start + 1];
        int i = start;
        //定义右边数组的下标
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= last) {
            if (c[i] < c[j]) {
                temp[k++] = c[i++];
            } else {
                temp[k++] = c[j++];
            }
        }
        //把左边剩余数组元素移入新数组中
        while (i <= mid) {
            temp[k++] = c[i++];
        }
        //把右边剩余数组元素移入新数组中
        while (j <= last) {
            temp[k++] = c[j++];
        }
        //把新的数组中的数覆盖到c数组中
        for (int k2 = 0; k2 < temp.length; k2++) {
            c[k2 + start] = temp[k2];
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6};
        int[] b = {7, 13, 22, 35};
        int[] c = {2, 3, 5, 7, 3, 6, 8, 4, 2};
        int[] d = MergeSortByCycle(a, b);

        c = MergeSortByRecurisive(c, 0, c.length - 1);
        //这里Arrays.toString(c)
        System.out.println("使用循环" + Arrays.toString(d));
        System.out.println("使用递归" + Arrays.toString(c));

    }


}

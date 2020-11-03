package com.mozss.basic.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 17:38
 */
/*
 * 杨辉三角形
 * */
public class YangHuiTriangle {
    /**
     * Title: 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
     * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
     * <p>
     * 例如，下面给出了杨辉三角形的前4行：
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     *
     * @description 递归获取杨辉三角指定行、列(从0开始)的值
     * 注意：与是否创建杨辉三角无关
     * @author rico
     * @x 指定行
     * @y 指定列
     */
    public static int getValue(int x, int y) {
        if (y <= x && y >= 0) {
            if (y == 0 || x == y) {   // 递归终止条件
                return 1;
            } else {
                // 递归调用，缩小问题的规模
                return getValue(x - 1, y - 1) + getValue(x - 1, y);
            }
        }
        return -1;
    }
}

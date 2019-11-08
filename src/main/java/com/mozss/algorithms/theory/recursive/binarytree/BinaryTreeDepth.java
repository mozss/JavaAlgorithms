package com.mozss.algorithms.theory.recursive.binarytree;

/**
 * @author mozss
 * @create 2019-11-08 16:36
 */
/*
 * 二叉树深度的问题
 * */
public class BinaryTreeDepth {

    public static int getTreeDepth(Tree t) {
        // 树为空
        if (t == null) // 递归终止条件
            return 0;
        int left = getTreeDepth(t.left); // 递归求左子树深度，缩小问题的规模
        int right = getTreeDepth(t.left); // 递归求右子树深度，缩小问题的规模
        return left > right ? left + 1 : right + 1;
    }

    public static int Add(int s, int b) {
        return 1;
    }
}

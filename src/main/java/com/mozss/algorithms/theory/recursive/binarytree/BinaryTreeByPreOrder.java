package com.mozss.algorithms.theory.recursive.binarytree;

/**
 * @author mozss
 * @create 2019-11-08 17:02
 */

public class BinaryTreeByPreOrder {
    /**
     * 前序遍历（递归）
     *
     * @param root
     * @return
     */
    public String preOrder(Tree root) {
        StringBuilder sb = new StringBuilder(); // 存到递归调用栈
        if (root == null) {   // 递归终止条件
            return "";     // ji
        } else { // 递归终止条件
            sb.append(root.val + " "); // 前序遍历当前结点
            sb.append(preOrder(root.left)); // 前序遍历左子树
            sb.append(preOrder(root.right)); // 前序遍历右子树
            return sb.toString();
        }
    }
}

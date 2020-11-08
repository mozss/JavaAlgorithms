package com.mozss.basic.algorithms.leetcode.depthfirst;


/**
 * @author mozss
 * @create 2019-09-06 14:57
 */

public class No104 {
	/*
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 题目名称:   104.求二叉树的最大深度
	 * 知识考察:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 题目描述:   给定一个二叉树,求其最大的深度.
	 *             二叉树的深度为根节点到最远节点的最长路径上的节点数
	 *
	 *             说明:叶子节点是没有子节点的节点
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * eg 1>:
	 * 输入Input:    [3,9,20,null,null,15,7]
	 * 输出Output:   3
	 * 说明:
	 *                      3
	 *                     / \
	 *                    9  20
	 *                      /  \
	 *                     15   7
	 *                  返回它的最大深度 3 。
	 * eg 2>:
	 * 输入Input:
	 * 输出Output:
	 * 说明:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 解题思路:
	 * 题目总结:
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 **/
	/*
     * 定义二叉树
     * public class TreeNode{
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     ThreeNode(int x) { val = x;}
     * }
     * /

/*
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            while (size-- > 0){
                TreeNode n = queue.remove();
                if (n.left != null) queue.add(n.left);
                if (n.right != null) queue.add(n.right);
            }
        }
        return level;

    }
*/


}

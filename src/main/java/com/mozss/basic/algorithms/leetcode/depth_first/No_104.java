package com.mozss.basic.algorithms.leetcode.depth_first;


/**
 * @author mozss
 * @create 2019-09-06 14:57
 */
/*
* 给定一个二叉树，求其最大的深度
*
* 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数
*
*说明：叶子节点是指没有子节点的节点
* 示例：
* 给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。
* */
public class No_104 {
    /*
     * 定义二叉树
     * public class TreeNode{
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     ThreeNode(int x) { val = x;}
     * }
     * */

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

package com.mozss.basic.algorithms.leetcode.array;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author    mozss
 * @create    2019-09-06 15:41
 */

public class No950 {
    public static void main(String[] args) {
        int[] deckDemo = {17, 13, 11, 2, 3, 5, 7};
        No950 no950 = new No950();
        int[] result = no950.deckRevealedIncreasing(deckDemo);
        System.out.println(result);
    }

    /*
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     *
     * 题目编号: 950
     * 题目名称: 递增顺序显示卡牌
     * 知识考察: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述: 牌组中的每张卡牌都对应一个唯一的整数，你可以按照你想要的顺序对这套卡牌进行排序
     * 最初，这些卡牌在牌组里是向下的（即，未显示的状态）
     * 现在，重复下面的步骤，直到显示所有的卡牌为止：
     * 1.从卡牌顶部抽取一张卡牌，显示它，然后将其从牌组中移除
     * 2.如果牌组中仍有牌，将下一张位于顶部的牌，放入底部
     * 3.如果仍有牌，重复1,2的动作，直到没有牌为止
     * <p>
     * 放回能以递增的顺序显示卡牌的牌组
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 输入Input: [17, 13, 11, 2, 3, 5, 7]
     * 输出Output: [2, 13, 3, 11, 5, 17, 7]  顶部->底部
     * 解释：我们得到的牌组的顺序[17,13,11,2,3,5,7](这个顺序不重要），然后将其
     * 重新排序。
     * 牌组以[2,13,3,11,5,17,7]开始，其中2位于牌组的顶部。
     * 我们显示2，将13放入底部，现在的牌组[3,11,5,17,7,13]
     * 我们显示3，将11放入底部，现在的牌组[5,17,7,13,11]
     * 我们显示5，将17放入底部，现在的牌组[7,13,11,17]
     * ......
     * 我们显示17
     * <p>
     * 最好的结果是，所有的卡片都是递增的顺序排列显示的，所有答案是正确的。
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路: 从示例的叙述中，我们可以知道，这是一个明显的队列操作，首先我们拿到输出结果
     * [2,13,3,11,5,17,7]，执行一下操作:
     * 1.左侧输出2
     * 2.此时数组不为空，左侧输出13，右侧将13添加到队尾
     * 3.左侧输出3
     * 4.此时数组不为空，左侧输出11，右侧将11添加到队尾
     * 5.反复知道数组为空
     * 从这个过程我们可以看出，利用队列，每隔一个元素输出一个，中间的间隔元素从队头移置队尾。
     * <p>
     * 如何创建这样一个数组呢，按着以上步骤反向操作即可：
     * 1.首先我们将给定数组排序
     * 2.开辟一个新的空间保存最终数组排序结果
     * 3.将排序好给定数组，按从大到小的顺序出队
     * 4.新数组为空，则直接压入新元素
     * 5.新数组不为空，则先将原有数组中的队头元素移置队尾
     * 6.重复3-5直至排序数组为空
     * 题目总结: * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    /**
     *
     * @title    题目解答 测是是是
     * @param    deck 测试
     * @return    res
     * @author    mozss
     **/
    public int[] deckRevealedIncreasing(int[] deck) {
        //Arrays.sort(int[] a):这个方法是对一个数组的所以的元素进行排序的，按照从小到达的顺序。
        Arrays.sort(deck);
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(deck[deck.length - 1]);
        for (int i = deck.length; i >= 0; i--) {
            deque.offerFirst(deque.pollFirst());
            deque.offerFirst(deck[i]);
        }

        int[] res = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            res[i] = deque.pollFirst();
        }
        return res;
    }
}
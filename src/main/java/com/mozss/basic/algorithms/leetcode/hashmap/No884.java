package com.mozss.basic.algorithms.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-09-06 11:59
 */
public class No884 {
    /**
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目名称:   884.两句话中不常见的单词
     * 知识考察:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 题目描述:   给定两个句子A和B(句子是一串空格分隔的单词,每个单词仅有小写字母组成)
     *             如果一个单词在其中一个句子中出现一次,在另一个句子中没有出现,那么这个单词就是不常见的.
     *
     *             返回所有不常用单词的列表;
     *             你可以按任何顺序返回列表;
     *
     *             提示:
     *                  1. 0 <= A.length <= 200
     *                  2. 0 <= B.length <= 200
     *                  3. A和B都只包含空格和小写字母
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * eg 1>:
     * 输入Input:    A = "this apple is sweet", B = "this apple is sour"
     * 输出Output:   ["sweet","sour"]
     * 说明:
     *
     * eg 2>:
     * 输入Input:    A = "apple apple", B = "banana"
     * 输出Output:   ["banana"]
     * 说明:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * 解题思路:   遍历AB，map统计每个次的次数；遍历map,次数为1的为不常见单词
     * 题目总结:
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     */
    public String[] uncommonFromSentences(String strA, String strB) {
        HashMap<String, Integer> map = new HashMap<>(200);
        String strSpace = "";
        List<String> result = new ArrayList<>();
        for (String strS : strA.split(strSpace)) {
            map.put(strS, map.containsKey(strS) ? map.get(strS) + 1 : 1);
        }
        for (String strS : strB.split(strSpace)) {
            map.put(strS, map.containsKey(strS) ? map.get(strS) + 1 : 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }
        String[] ss = new String[result.size()];
        return result.toArray(ss);
    }
    
    public static void main(String[] args) {
        String strADemo = "this apple is sweet";
        String strBDemo = "this apple is sour";
        No884 no884 = new No884();
        String[] bb = no884.uncommonFromSentences(strADemo,strBDemo);
        System.out.println(bb);
    }

}

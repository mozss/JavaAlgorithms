package com.mozss.algorithms.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-09-06 11:59
 */
/*
* 884.两句话中不常见单词
* 给定两个句子A和B（句子是一串空格分隔的单词，每个单词仅有小写字母组成）
* 如果一个单词在其中一个句子中只出现一次，在另一个句子中没有出现，那么这个单词就是不常见
*
* 返回所有不常用单词的列表
* 你可以按任何顺序返回列表
*
*示例 1：
输入：A = "this apple is sweet", B = "this apple is sour"
输出：["sweet","sour"]
*
示例 2：
输入：A = "apple apple", B = "banana"
输出：["banana"]
*
*提示：
* 1. 0 <= A.length <= 200
* 2. 0 <= A.length <= 200
* 3. A和B都只包含空格和小写字母
*
* */
public class No_884 {
    public String[] uncommonFromSentences(String A, String B) {
        //思路：遍历AB，map统计每个次的次数；遍历map,次数为1的为不常见单词

        Map<String, Integer> map = new HashMap<>();
        List<String> r = new ArrayList<>();
        for (String s : A.split(" ")) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        for (String s : B.split(" ")) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                r.add(key);
            }
        }
        String[] ss = new String[r.size()];
        return r.toArray(ss);

    }

}

package com.mozss.algorithms.leetcode.hashmap;


import java.util.ArrayList;

/**
 * @author mozss
 * @create 2019-09-06 10:09
 */
/*
 * 500.键盘行
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词，键盘如下：
 *
 * 示例1：
 * 输入：["Hello","Alaska","Dad","Peace"]
 * 输出：["Alaska", "Dad"]
 *
 * 注意：
 * 1.你可以重复使用键盘上同一字符
 * 2.你可以假设输入的字符串将只包含字母
 *
 * */
public class No_500 {
    public String[] findWords(String[] words) {
        String[] lines = new String[3];
        lines[0] = "qwertyuiop";
        lines[1] = "asdfghjkl";
        lines[2] = "zxcvbnm";
        int[] map = new int[26];
        for (int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            for (char chr : chars) {
                map[chr - 'a'] = i;
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            boolean isInline = true;
            String aWord = word.toLowerCase();
            char[] tmp = aWord.toCharArray();
            for (int i = 1; i < tmp.length; ++i) {
                if (map[tmp[i] - 'a'] != map[tmp[i - 1] - 'a']) {
                    isInline = false;
                    break;
                }
            }
            if (isInline) {
                result.add(word);
            }

        }
        return result.toArray(new String[result.size()]);
    }


}

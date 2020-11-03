package com.mozss.basic.algorithms.offer;

/**
 * @ClassName Test
 * @Author mozss
 **/

public class No5 {
    /**
     * @Description: 将一个字符串中的空格替换为"%20"。比如"A B",替換成"A%20B"
     */
    public static void main(String[] args) {
        String input = "A B";
        String output = replaceSpace(input);
        System.out.println(output);
    }

    private static String replaceSpace(String strInput) {
        StringBuffer str = new StringBuffer(strInput);
        int p1 = str.length() - 1;
        for (int i = 0; i < p1; i++) {
            if (str.charAt(i) == ' ') {
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}

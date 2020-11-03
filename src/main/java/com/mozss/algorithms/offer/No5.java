package com.mozss.algorithms.offer;

/*
* 将一个字符串中的空格替换为"%20"
* Input: "A B"
* Output: "A%20B"
* */

public class No5 {
    public static void main(String[] args) {
        String input = "A B";
        String output = replaceSpace(input);
        System.out.println(output);
    }

    private static String replaceSpace(String strInput) {
        StringBuffer str = new StringBuffer(strInput);
        int P1 = str.length() - 1;
        for (int i = 0; i < P1; i++) {
            if(str.charAt(i) ==' '){
                str.append("  ");
            }
        }
        int P2 = str.length() - 1;
        while (P1>=0 && P2>P1){
            char c = str.charAt(P1--);
            if(c == ' '){
                str.setCharAt(P2--,'0');
                str.setCharAt(P2--,'2');
                str.setCharAt(P2--,'%');
            }else{
                str.setCharAt(P2--,c);
            }
        }
        return str.toString();
    }
}

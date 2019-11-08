package com.mozss.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 14:23
 */
/*
 * 汉诺塔问题：
 *
 * 所有的盘子刚开始都放置在A 塔座上。这个难题的目标是将所有的盘子都从塔座A移动到塔座C上。
 *
 * */
public class TowerOfHanoi {
    /*
     * 汉诺塔问题
     * @param dish 盘子的个数
     * @param from 初始塔座
     * @param temp 中介塔座
     * @param to 目标塔座
     * */
    public static void move(int dish, String from, String temp, String to) {
        if (dish == 1) {
            System.out.println("将盘子" + dish + "从塔座" + from + "移动到目标塔座" + to);
        } else {
            //A(初始)，B(目标)，C（中介）
            move(dish - 1, from, to, temp);
            System.out.println("将盘子" + dish + "从塔座" + from + "移动到目标塔座" + to);
            move(dish - 1, temp, from, to);
        }
    }

    public static void main(String[] args) {
        move(3, "A", "B", "c");
    }
}

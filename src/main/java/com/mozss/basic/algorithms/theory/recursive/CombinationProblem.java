package com.mozss.basic.algorithms.theory.recursive;

/**
 * @author mozss
 * @create 2019-11-08 15:59
 */
/*
 *在数学中，组合是对事物的一种选择，而不考虑他们的顺序.
 *
 *比如有5个队员，名称为A,B,C,D,E。从这五个队员中选择三个去登山。
 *假设把从 5 个人中选出 3 个人的组合简写为（5,3）
 *那么根据法则可以有：(n,k) = (n-1,k-1) + (n-1,k)
 *显然可以使用递归来实现。
 *
 * */
public class CombinationProblem {
    //组中所有可以供选择的人员
    private char[] persons;
    //标记成员是否被选中，选中为true
    private boolean[] selects;

    public CombinationProblem(char[] persons) {
        this.persons = persons;
        selects = new boolean[persons.length];
    }

    public static void main(String[] args) {
        char[] persons = {'A', 'B', 'C', 'D', 'E'};
        CombinationProblem cp = new CombinationProblem(persons);
        cp.showTeams(3);
    }

    public void showTeams(int teamNumber) {
        combination(teamNumber, 0);
    }

    /*
     * @param teamNumber需要选择的队员数目
     * @param index从第几个队员开始选择
     * */
    private void combination(int teamNumber, int index) {
        //为0时，找到一组
        if (teamNumber == 0) {
            for (int i = 0; i < selects.length; i++) {
                if (selects[i] == true) {
                    System.out.println(persons[i] + "");
                }
            }
            System.out.println();
            return;
        }
        //index超过组中人员的数目，表示找不到
        if (index >= persons.length) {
            return;
        }
        selects[index] = true;
        combination(teamNumber - 1, index + 1);
        selects[index] = false;
        combination(teamNumber, index + 1);
    }


}

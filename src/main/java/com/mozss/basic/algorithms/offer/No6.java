package com.mozss.basic.algorithms.offer;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 从尾到头打印链表
 * */

public class No6 {
    /*
     * 需要定义节点，值，指针
     * */

    public static void main(String[] Args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        No6 no6 = new No6();
        ArrayList resutl = no6.printListFromTailToHead(l1);
        ArrayList resutl_02 = no6.printListFromTailToHead_02(l1);
        System.out.println("result01" + resutl);
        System.out.println("result02:" + resutl_02);

        //使用新的列表去测试第三种方法
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        ArrayList resutl_03 = no6.printListFromTailToHead_03(list1);
        System.out.println("result03" + resutl_03);
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
    /*
     * 1.使用递归：
     *   要逆序打印链表 1->2->3(3,2,1),可以先逆序打印链表 2->3(3,2),最后打印第一个节点。
     *   而链表2->3可以看成一个新的链表，要逆序打印该链表可以继续使用求解函数，也就是在求解
     *   函数中调用自己，这就是递归函数。
     * */

    public ArrayList<Integer> printListFromTailToHead_02(ListNode listNode) {
        //构建逆序链表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        //构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    /*
     * 2.使用头插法：
     *   头结点和第一个节点的区别：
     *       a.头结点是在头插法中使用的一个额外的结点，这个结点是不储存值的
     *       b.第一个节点就是链表的第一真正存储值的节点
     * */

    public ArrayList<Integer> printListFromTailToHead_03(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ret = new ArrayList<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }
        return ret;
    }

    /*
     * 使用栈
     * 栈具有后进先出的特定，在遍历链表时将值按照顺序放入栈中，最后出栈的顺序为逆序
     * */

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

























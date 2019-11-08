package com.mozss.algorithms.data_structures.list;

/**
 * @author mozss
 * @create 2019-11-08 18:52
 */
/*
 *用单向链表实现栈
 *
 *栈的pop()方法和push()方法，对应于链表的在头部删除元素deleteHead()以及在头部增加元素addHead()
 * */
public class StackSingleLink {
    private SingleLinkedList link;

    public StackSingleLink() {
        link = new SingleLinkedList();
    }

    //添加元素
    public void push(Object obj) {
        link.addHead(obj);
    }

    //移除栈顶元素
    public Object pop() {
        Object obj = link.deleteHead();
        return obj;
    }

    //判断是否为空
    public boolean isEmpty() {
        return link.isEmpty();
    }

    //打印栈内元素信息
    public void display() {
        link.display();
    }
}

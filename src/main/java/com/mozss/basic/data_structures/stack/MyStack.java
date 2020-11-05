package com.mozss.basic.data_structures.stack;


/*
 * 这个栈是用数组实现的，内部定义了一个数组，一个表示最大容量的值以及一个指向栈顶元素的top变量。构造方法根据参数规定的容量创建一个新栈，
 * push()方法是向栈中压入元素，指向栈顶的变量top加一，使它指向原顶端数据项上面的一个位置，并在这个位置上存储一个数据。
 * pop()方法返回top变量指向的元素，然后将top变量减一，便移除了数据项。要知道 top 变量指向的始终是栈顶的元素。
 * */

public class MyStack {
    private final int[] array;
    private final int maxSize;
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    //压入数据
    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        }
    }

    //弹出栈顶数据
    public int pop() {
        return array[top--];
    }

    //访问栈顶数据
    public int peek() {
        return array[top];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return (top == -1);
    }

    //判断栈是否满了
    public boolean isFull() {
        return (top == maxSize - 1);
    }

}

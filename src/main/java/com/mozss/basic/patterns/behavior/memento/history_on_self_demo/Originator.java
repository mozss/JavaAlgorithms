package com.mozss.basic.patterns.behavior.memento.history_on_self_demo;

/**
 * @author mozss
 * @create 2019-10-27 9:29
 */

public class Originator {
    public String state;

    /*
     * 构造函数
     * */
    public Originator() {
    }

    /*
     * 改变状态
     * */
    public void changeState(String state) {
        this.state = state;
        System.out.println("State has been changed to:" + state);
    }

    /*
     * 工厂方法，返回一个新的备忘录对象
     * */
    public Memento createMemento() {
        return new Memento(this);
    }

    /*
     * 将发起人恢复到备忘录对象所记录的状态上
     * */
    public void restoreMemento(MementoIF memento) {
        Memento m = (Memento) memento;
        changeState(m.state);
    }

    /*
     * 内部成员类，备忘录
     * */
    class Memento implements MementoIF {
        private String state;

        /*
         * 取值方法
         * */
        public String getState() {
            return state;
        }

        /*
         * 构造函数
         * */
        public Memento(Originator o) {
            this.state = o.state;
        }
    }


}

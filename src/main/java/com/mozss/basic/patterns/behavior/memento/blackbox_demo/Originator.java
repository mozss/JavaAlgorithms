package com.mozss.basic.patterns.behavior.memento.blackbox_demo;

/**
 * @author mozss
 * @create 2019-10-27 7:32
 */

public class Originator {

    private String state;

    /*
     * 构造函数
     * */
    public Originator() {
    }

    /*
     * 工厂方法，返回一个新的备忘录对象
     * */
    public MementoIF createMemento() {
        return new Memento(this.state);
    }

    /*
     * 将发起人恢复到备忘录对象记录的状态
     * */
    public void restoreMemento(MementoIF memento) {
        Memento aMemento = (Memento) memento;
        this.setState(aMemento.getState());
    }

    /*
     * 状态的取值
     * */
    public String getState() {
        return state;
    }

    /*
     * 状态的赋值
     * */
    public void setState(String state) {
        this.state = state;
        System.out.println("state = " + state);
    }

    /*
     * 内部成员类,备忘录
     * */
    protected class Memento implements MementoIF {
        private String savedState;

        /*
         * 构造函数
         * */
        public Memento(String savedState) {
            this.savedState = savedState;
        }

        /*
         * 取值和赋值方法
         * */
        public void setState(String savedState) {
            this.savedState = savedState;
        }

        public String getState() {
            return savedState;
        }
    }
}

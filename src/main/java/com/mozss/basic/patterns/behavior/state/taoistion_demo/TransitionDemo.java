package com.mozss.basic.patterns.behavior.state.taoistion_demo;

/**
 * @author mozss
 * @create 2019-10-27 13:16
 */
/*
 * 下面的代码嵌套复杂，对于这样的状态和事件，可以使用状态模式处理优化。参考该目录下demo文件夹中的实现
 * */
public class TransitionDemo {
    //开
    static final int STATE_LOCKED = 1;
    //闭
    static final int STATE_UNLOCKED = 2;
    //念诀
    static final int EVENT_SPELL = 4;
    //跃入
    static final int EVENT_PASS = 8;

    public void Transition(int event) {
        int state = STATE_LOCKED;
        switch (state) {
            case (STATE_LOCKED):
                switch (event) {
                    case (EVENT_SPELL):
                        state = STATE_UNLOCKED;
                        break;
                    case (EVENT_PASS):
                        Bang();
                        break;
                }
                break;
            case STATE_UNLOCKED:
                switch (event) {
                    case (EVENT_SPELL):
                        state = STATE_UNLOCKED;
                        break;
                    case (EVENT_PASS):
                        state = STATE_LOCKED;
                        break;
                }
                break;


        }
    }

    public void Bang() {
        System.out.println("You are damned");
    }

}

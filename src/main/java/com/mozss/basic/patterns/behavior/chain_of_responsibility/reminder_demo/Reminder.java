package com.mozss.basic.patterns.behavior.chain_of_responsibility.reminder_demo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author mozss
 * @create 2019-10-26 15:58
 */
public class Reminder {
    /*
     * java.util.Timer在5秒后执行一个任务，这个任务封装在RemindTask对象中
     * */
    Timer timer;

    /*
     * 构造函数
     * */
    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new ReminderTask(), seconds * 1000);
    }

    /*
     * main方法
     * */
    public static void main(String[] args) {
        System.out.println("About to schedule task");
        new Reminder(5);
        System.out.println("Task scheduled");
    }

    /*
     * 内部成员类，描述将要执行的任务
     * */
    class ReminderTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time is up!");
            //Terminate the timer thread
            timer.cancel();
        }
    }

    /*
     * 在每一个Timer对象的背后，都有一个背景线程，用来顺序执行Timer的任务，这些任务应当迅速结束，不然就会霸占timer用来执行任务的线程，
     * 从而延迟后面的任务。
     * 当所有的任务都完成之后，timer的任务执行线程就会顺利地结束并被Java垃圾收集器收集，只是垃圾收集器的时间并不能预测。如果程序想要
     * 迅速地结束timer的任务执行线程，调用方就应当调用timer的cancel()方法。上面的例子就是实现了这一办法。
     *
     * Timer类是线程安全的，换言之，可以有多个线程共享同一个Timer对象，而不需要同步化，这是使用Timer的一个好处。
     *
     * Timer类实际上是用Object.wait(long)方法实现定时的，因此Timer类不能保证实时效果，Timer类可以处理多达几千个任务。
     *
     * */
}

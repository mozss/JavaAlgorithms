package com.mozss.basic.patterns.structural.composite.safe;

/**
 * @author mozss
 * @create 2019-10-28 20:41
 */

public interface Component {
    /*
     * 返回自己的实例
     * */
    Composite getComposite();

    /*
     * 某个商业方法
     * */
    void sampleOperation();

}

package org.example.adapter;

/**
 * @author yangshunxin
 * @create 2021-07-17-17:39
 */
// 真正的适配器 ： 需要连接USB， 连接网线
// 1. 继承了 （类适配器， 单继承）
// 2. 组合（对象适配器，常用）
public class Adapter2 implements NetToUsb{
    // 这里用来 组合的方法， 能够适配更多的 网线


    Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();// 可以上网了
    }
}

package org.example.adapter;

/**
 * @author yangshunxin
 * @create 2021-07-17-17:39
 */
// 真正的适配器 ： 需要连接USB， 连接网线
// 1. 继承了 （类适配器， 单继承）
// 2. 组合（对象适配器，常用）
public class Adapter extends Adaptee implements NetToUsb{
    // 这里用来 继承的方法， 适配器自带上网功能

    @Override
    public void handleRequest() {
        super.request();// 可以上网了
    }
}

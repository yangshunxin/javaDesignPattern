package org.example.factory.method;

/**
 * @author yangshunxin
 * @create 2021-07-15-17:45
 */
public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}

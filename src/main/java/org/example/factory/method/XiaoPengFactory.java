package org.example.factory.method;

/**
 * @author yangshunxin
 * @create 2021-07-15-17:45
 */
public class XiaoPengFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new XiaoPeng();
    }
}

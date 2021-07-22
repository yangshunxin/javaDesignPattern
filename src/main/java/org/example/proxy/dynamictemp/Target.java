package org.example.proxy.dynamictemp;

/**
 * @author yangshunxin
 * @create 2021-07-18-16:43
 */
public class Target implements Subject {

    // 代理对象不需要实现接口，但是目标对象一定要实现接口，否则无法适用动态代理
    @Override
    public void request() {
        System.out.println("访问真实的接口。。。 我被代理了");
    }

    @Override
    public void response() {
        System.out.println("响应真实的接口。。。 我被代理了");
    }
}

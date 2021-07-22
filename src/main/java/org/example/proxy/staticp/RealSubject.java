package org.example.proxy.staticp;

/**
 * @author yangshunxin
 * @create 2021-07-18-15:56
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真实的主题方法。。。。。");
    }
}

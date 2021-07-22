package org.example.template;

/**
 * @author yangshunxin
 * @create 2021-07-20-20:36
 */
public class ConcreteClass extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}

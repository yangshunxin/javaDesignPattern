package org.example.factory.method;

/**
 * @author yangshunxin
 * @create 2021-07-15-17:02
 *
 * 简单工厂模式 也就是静态工厂模式
 *
 * 使用者使用一个名字就能创建一个实例对象，如果创建对象需要很多参数，就都可以忽略了；
 *
 * 弊端：增加一个产品 需要修改代码，
 *
 */
public interface CarFactory {

    public Car getCar();
}

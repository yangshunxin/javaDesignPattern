package org.example.flyweight;

/**
 * @author yangshunxin
 * @create 2021-07-18-20:44
 */
// 抽象的 享元角色
public interface Flyweight {

    // 相同的操作接口
    public void operation(UnsharedConcreteFlyweight state);

}

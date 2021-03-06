package org.example.flyweight;

/**
 * @author yangshunxin
 * @create 2021-07-18-20:47
 */
// 具体的享元角色
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元" + key + "被访问");
        System.out.println("非享元信息是："+ state.getInfo());
    }
}

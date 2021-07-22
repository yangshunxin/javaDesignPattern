package org.example.flyweight;

/**
 * @author yangshunxin
 * @create 2021-07-18-20:45
 */
// 非享元角色 ---
public class UnsharedConcreteFlyweight {
    // 可以有多个
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

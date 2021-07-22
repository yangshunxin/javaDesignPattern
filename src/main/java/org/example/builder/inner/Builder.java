package org.example.builder.inner;

/**
 * @author yangshunxin
 * @create 2021-07-17-15:23
 *
 * // 建造者
 */
public abstract class Builder {

    public abstract Builder builderA(String info); // 汉堡
    public abstract Builder builderB(String info); // 可乐
    public abstract Builder builderC(String info); // 薯条
    public abstract Builder builderD(String info); // 甜点

    public abstract Product getProduct();
}

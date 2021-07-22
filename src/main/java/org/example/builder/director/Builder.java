package org.example.builder.director;

/**
 * @author yangshunxin
 * @create 2021-07-16-18:25
 *
 *
 * 抽象的建造者：方法
 */
public abstract class Builder {
    // 表示建房子的步骤 A->B->C->D
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    // 完工: 得到产品
    abstract Product getProduct();
}

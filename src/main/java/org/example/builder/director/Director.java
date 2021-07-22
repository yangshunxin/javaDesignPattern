package org.example.builder.director;

/**
 * @author yangshunxin
 * @create 2021-07-16-18:38
 *
 * 指挥： 核心
 *  负责指挥构建一个工程，工程如何构建，由它决定
 *
 */
public class Director {

    // 指挥工人按照顺序建房子
    public Product build(Builder builder){
        // 这里的顺序可以更换，由Director决定
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }
}

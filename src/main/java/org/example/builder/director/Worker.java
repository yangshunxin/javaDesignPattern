package org.example.builder.director;

import org.example.builder.director.Builder;
import org.example.builder.director.Product;

/**
 * @author yangshunxin
 * @create 2021-07-16-18:31
 *
 * 具体的建造者： 工人
 *
 */
public class Worker extends Builder {

    // 这个产品是工人new出来的
    private Product product;

    public Worker(){
        // 这个地方是 工人创建产品
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}

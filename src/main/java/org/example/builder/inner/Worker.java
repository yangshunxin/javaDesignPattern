package org.example.builder.inner;

/**
 * @author yangshunxin
 * @create 2021-07-17-15:29
 */
public class Worker extends Builder{

    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    public Builder builderA(String info) {
        product.setBuildA(info);
        return this;
    }

    @Override
    public Builder builderB(String info) {
        product.setBuildB(info);
        return this;
    }

    @Override
    public Builder builderC(String info) {
        product.setBuildC(info);
        return this;
    }

    @Override
    public Builder builderD(String info) {
        product.setBuildD(info);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

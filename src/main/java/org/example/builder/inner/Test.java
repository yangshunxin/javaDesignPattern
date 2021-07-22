package org.example.builder.inner;

/**
 * @author yangshunxin
 * @create 2021-07-17-15:31
 */
public class Test {
    public static void main(String[] args) {
        // 服务员
        Worker worker = new Worker();
        // 链式编程： 在原来的基础上，可以自由组合了，如果不组合，也有默认套餐
        Product product = worker.builderA("全假桶").getProduct();

        System.out.println(product.toString());
    }
}

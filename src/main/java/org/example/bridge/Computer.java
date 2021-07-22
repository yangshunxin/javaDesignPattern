package org.example.bridge;

/**
 * @author yangshunxin
 * @create 2021-07-18-14:52
 */
// 抽象的电脑类型
public abstract class Computer {

    // 组合 品牌 ~~~ 多使用组合 少适用继承
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info(); // 自带品牌
        //
    }

}

package org.example.bridge;

/**
 * @author yangshunxin
 * @create 2021-07-18-14:58
 */
public class Laptop extends Computer{
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}

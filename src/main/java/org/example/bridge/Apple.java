package org.example.bridge;

/**
 * @author yangshunxin
 * @create 2021-07-18-14:52
 */
// 苹果品牌
public class Apple implements Brand{
    @Override
    public void info() {
        System.out.print("苹果");
    }
}

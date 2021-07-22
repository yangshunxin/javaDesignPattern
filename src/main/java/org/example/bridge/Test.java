package org.example.bridge;

/**
 * @author yangshunxin
 * @create 2021-07-18-14:59
 */
public class Test {
    public static void main(String[] args) {
        // 苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();

        // 联想台式机
        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();
    }
}

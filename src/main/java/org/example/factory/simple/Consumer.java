package org.example.factory.simple;

/**
 * @author yangshunxin
 * @create 2021-07-15-17:00
 */
public class Consumer {
    public static void main(String[] args) {
        // 传统方法
//        Car car = new WuLing(); // 如果实例化需要很多参数，就很麻烦，
//        Car car2 = new Tesla();

        // 如果创建对象需要很多参数，这里用一个名字就能创建对象了；
        Car car = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");


        car.name();
        car2.name();
    }
}

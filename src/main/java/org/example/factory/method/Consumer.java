package org.example.factory.method;

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
//        Car car = CarFactory.getCar("五菱");
//        Car car2 = CarFactory.getCar("特斯拉");

        Car car = new WuLingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();

        car.name();
        car2.name();

        // 增加一个产品只需要 添加一个产品工厂和一个产品类
        Car car1 = new XiaoPengFactory().getCar();
        car1.name();
    }
}

package org.example.interpreter.cardreader;

/**
 * @author yangshunxin
 * @create 2021-07-26-17:21
 */
public class Test {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}

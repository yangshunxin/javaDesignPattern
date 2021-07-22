package org.example.Strategy;

/**
 * @author yangshunxin
 * @create 2021-07-21-19:49
 */
public class Test {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("=======================");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}

package org.example.Strategy;

/**
 * @author yangshunxin
 * @create 2021-07-21-19:45
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}

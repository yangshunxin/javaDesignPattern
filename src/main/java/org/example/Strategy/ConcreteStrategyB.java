package org.example.Strategy;

/**
 * @author yangshunxin
 * @create 2021-07-21-19:46
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}

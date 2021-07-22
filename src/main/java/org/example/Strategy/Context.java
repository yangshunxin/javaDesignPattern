package org.example.Strategy;

/**
 * @author yangshunxin
 * @create 2021-07-21-19:47
 */
public class Context {
    private Strategy strategy;


    public void strategyMethod(){
        strategy.strategyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}

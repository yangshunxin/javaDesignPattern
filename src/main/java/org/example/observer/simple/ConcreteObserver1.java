package org.example.observer.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-11:32
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}

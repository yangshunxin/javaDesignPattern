package org.example.observer.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-11:35
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Observer obs : observers) {
            obs.response();
        }
    }
}

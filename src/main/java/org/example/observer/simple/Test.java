package org.example.observer.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-11:36
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        Observer obs3 = new ConcreteObserver2();
        Observer obs4 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.add(obs3);
        subject.add(obs4);
        subject.notifyObserver();
    }
}

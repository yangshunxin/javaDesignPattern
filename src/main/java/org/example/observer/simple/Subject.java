package org.example.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunxin
 * @create 2021-07-23-11:30
 */
//抽象目标
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //添加观察者
    public void add(Observer observer){
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver(); // 通知观察者方法

}

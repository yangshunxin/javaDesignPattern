package org.example.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangshunxin
 * @create 2021-07-23-14:38
 */
//具体观察者类：空方
public class Bear implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = (Float) arg;

        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}

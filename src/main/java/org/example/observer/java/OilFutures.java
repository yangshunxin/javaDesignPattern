package org.example.observer.java;

import java.util.Observable;

/**
 * @author yangshunxin
 * @create 2021-07-23-14:37
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged(); //设置内部标志位，著名数据发生变化
        super.notifyObservers(price);

        this.price = price;
    }
}

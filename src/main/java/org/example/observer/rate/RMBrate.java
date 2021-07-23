package org.example.observer.rate;

/**
 * @author yangshunxin
 * @create 2021-07-23-13:57
 */
public class RMBrate extends Rate{
    @Override
    public void change(int number) {
        for (Company obs : companies){
            obs.response(number);
        }
    }
}

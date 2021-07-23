package org.example.observer.ring;

import java.util.EventListener;

/**
 * @author yangshunxin
 * @create 2021-07-23-14:10
 */
//抽象观察者类：铃声事件监听器
public interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    public void hearBell(RingEvent e);
}

package org.example.mediator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunxin
 * @create 2021-07-23-15:05
 */
//具体中介者
public class ConcreteMediator extends Mediator{

    private final List<Colleague> colleagues = new ArrayList<>();


    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague c) {
        for (Colleague ob : colleagues) {
            // 对所有注册的 college，除了自己之外，其他的都 通知
            if (!ob.equals(c)) {
                ((Colleague) ob).receive();
            }
        }
    }
}

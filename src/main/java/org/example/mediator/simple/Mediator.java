package org.example.mediator.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-15:04
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague); // 转发

}

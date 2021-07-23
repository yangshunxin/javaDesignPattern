package org.example.mediator.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-15:07
 */
public class ConcreteColleague3 extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类3发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
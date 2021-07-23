package org.example.mediator.estate;

/**
 * @author yangshunxin
 * @create 2021-07-23-15:54
 */
public interface Medium {
    void register(Customer member); //客户注册
    void relay(String from, String ad); //转发
}

package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:15
 *
 * 手机产品接口
 */
public interface IphoneProduct {

    // 定义手机的抽象功能
    void start();
    void shutdown();
    void callup();
    void sendSMS();
}

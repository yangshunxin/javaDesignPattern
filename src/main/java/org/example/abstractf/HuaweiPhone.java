package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:20
 */
public class HuaweiPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}

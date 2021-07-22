package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:23
 */
public class XiaomiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shudown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}

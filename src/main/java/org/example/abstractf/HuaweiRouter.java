package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:24
 */
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shudown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器打开设置");
    }
}

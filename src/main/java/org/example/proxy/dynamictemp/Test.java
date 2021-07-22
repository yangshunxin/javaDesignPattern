package org.example.proxy.dynamictemp;

/**
 * @author yangshunxin
 * @create 2021-07-18-16:41
 */
public class Test {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();

        Subject target = jdkProxy.getInstance(new Target());
        target.request();
        target.response();
    }
}

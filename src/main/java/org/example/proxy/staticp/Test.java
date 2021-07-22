package org.example.proxy.staticp;

/**
 * @author yangshunxin
 * @create 2021-07-18-16:02
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Proxy();

        subject.request();
    }
}

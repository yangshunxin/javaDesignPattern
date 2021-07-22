package org.example.chainOfResponsibility.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-15:25
 */
public class Test {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求 "two"
        handler1.handleRequest("two");
    }
}

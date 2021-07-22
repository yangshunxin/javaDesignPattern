package org.example.chainOfResponsibility.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-15:15
 */

//抽象处理者角色
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}

package org.example.proxy.staticp;

/**
 * @author yangshunxin
 * @create 2021-07-18-15:57
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    @Override
    public void request() {
        // 这里线程不安全
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequst();
    }

    public void preRequest(){
        System.out.println("访问真实主题之前的预处理，，，");
    }

    public void postRequst(){
        System.out.println("访问真实主题之后的处理，，，，");
    }
}

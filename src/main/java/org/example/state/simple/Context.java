package org.example.state.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-16:15
 */
public class Context {
    private State state;


    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 对请求进行处理
    public void handle(){
        state.handle(this);
    }
}

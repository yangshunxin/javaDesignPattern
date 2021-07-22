package org.example.state.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-16:18
 */
public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

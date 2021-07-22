package org.example.state.simple;

/**
 * @author yangshunxin
 * @create 2021-07-22-16:19
 */
public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}

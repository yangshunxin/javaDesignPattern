package org.example.memento.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:09
 */
//发起人
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);  // 其实就是复制了 一个 Memento
    }

    public void restoreMemento(Memento m){
        this.setState(m.getState());
    }

}

package org.example.memento.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:09
 */
//备忘录
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

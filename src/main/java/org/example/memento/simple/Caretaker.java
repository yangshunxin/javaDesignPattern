package org.example.memento.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:13
 */
//管理者
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

package org.example.memento.clone;

/**
 * @author yangshunxin
 * @create 2021-07-26-16:05
 */
//原型管理者
public class PrototypeCaretaker {
    private OriginatorPrototype opt;
    public void setMemento(OriginatorPrototype opt) {
        this.opt = opt;
    }
    public OriginatorPrototype getMemento() {
        return opt;
    }
}

package org.example.memento.clone;

/**
 * @author yangshunxin
 * @create 2021-07-26-16:04
 */
public class OriginatorPrototype implements Cloneable{
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public OriginatorPrototype createMemento() {
        return this.clone();
    }
    public void restoreMemento(OriginatorPrototype opt) {
        this.setState(opt.getState());
    }
    public OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}

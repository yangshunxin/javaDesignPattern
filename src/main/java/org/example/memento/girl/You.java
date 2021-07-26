package org.example.memento.girl;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:43
 */
//发起人：您
public class You {
    private String wifeName;    //妻子
    public void setWife(String name) {
        wifeName = name;
    }
    public String getWife() {
        return wifeName;
    }
    public Girl createMemento() {
        return new Girl(wifeName);
    }
    public void restoreMemento(Girl p) {
        setWife(p.getName());
    }
}

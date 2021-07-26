package org.example.memento.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:14
 */
public class Test {
    public static void main(String[] args) {
        Originator or = new Originator(); //发起人
        Caretaker cr = new Caretaker(); //管理者

        or.setState("S0");
        System.out.println("初始状态:" + or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("S1");
        System.out.println("新的状态:" + or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("恢复状态:" + or.getState());
    }
}

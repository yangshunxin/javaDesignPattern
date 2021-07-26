package org.example.memento.girl;

/**
 * @author yangshunxin
 * @create 2021-07-26-15:44
 */
//管理者：美女栈
public class GirlStack {
    private final Girl[] girl;
    private int top;
    GirlStack() {
        girl = new Girl[5];
        top = -1;
    }
    public boolean push(Girl p) {
        if (top >= 4) {
            System.out.println("你太花心了，变来变去的！");
            return false;
        } else {
            girl[++top] = p;
            return true;
        }
    }
    public Girl pop() {
        if (top <= 0) {
            System.out.println("美女栈空了！");
            return girl[0];
        } else return girl[top--];
    }
}

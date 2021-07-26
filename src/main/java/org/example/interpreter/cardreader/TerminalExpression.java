package org.example.interpreter.cardreader;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangshunxin
 * @create 2021-07-26-17:10
 */
//终结符表达式类
public class TerminalExpression implements Expression{

    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {

        if (set.contains(info)){
            return true;
        }

        return false;
    }
}

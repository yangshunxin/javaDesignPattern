package org.example.interpreter.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-16:55
 */
//非终结符表达式类
public class NonterminalExpression implements AbstractExpression{

    private AbstractExpression exp1;
    private AbstractExpression exp2;

    @Override
    public void interpret(String info) {
        // 对非终结符表达式的处理
    }
}

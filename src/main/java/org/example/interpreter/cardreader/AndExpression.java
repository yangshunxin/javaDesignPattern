package org.example.interpreter.cardreader;

/**
 * @author yangshunxin
 * @create 2021-07-26-17:14
 */
public class AndExpression implements Expression{

    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}

package org.example.visitor.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-10:28
 */
//具体元素A类
public class ConcreteElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public String operationA(){
        return "具体元素A的操作";
    }
}

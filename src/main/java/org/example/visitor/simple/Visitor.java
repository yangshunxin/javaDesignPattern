package org.example.visitor.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-10:26
 */
public interface Visitor {
    // 重载的方法
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);

}

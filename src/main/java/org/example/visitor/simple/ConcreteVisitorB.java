package org.example.visitor.simple;

/**
 * @author yangshunxin
 * @create 2021-07-26-10:27
 */
public class ConcreteVisitorB implements Visitor{
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}

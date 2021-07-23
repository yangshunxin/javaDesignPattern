package org.example.mediator.simple;

/**
 * @author yangshunxin
 * @create 2021-07-23-15:11
 */
public class Test {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3, c4;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        c3 = new ConcreteColleague3();
        c4 = new ConcreteColleague4();
        md.register(c1);
        md.register(c2);
        md.register(c3);
        md.register(c4);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}

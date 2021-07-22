package org.example.chainOfResponsibility.applicationExample;

/**
 * @author yangshunxin
 * @create 2021-07-22-15:42
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 分析：假如规定学生请假小于或等于 2 天，班主任可以批准；小于或等于 7 天，系主任可以批准；小于或等于 10 天，院长可以批准；其他情况不予批准；这个实例适合使用职责链模式实现。
         *
         * 首先，定义一个领导类（Leader），它是抽象处理者，包含了一个指向下一位领导的指针 next 和一个处理假条的抽象处理方法 handleRequest(int LeaveDays)；然后，定义班主任类（ClassAdviser）、系主任类（DepartmentHead）和院长类（Dean），它们是抽象处理者的子类，是具体处理者，必须根据自己的权力去实现父类的 handleRequest(int LeaveDays) 方法，如果无权处理就将假条交给下一位具体处理者，直到最后；客户类负责创建处理链，并将假条交给链头的具体处理者（班主任）。图 3 所示是其结构图。
         *
         *
         * */
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        // 增加一个模块 也很容易
        Leader teacher4=new DeanOfStudies();
        teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(15);
    }
}

package org.example.state.scoreSample;

/**
 * @author yangshunxin
 * @create 2021-07-22-18:09
 */
public class Test {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}

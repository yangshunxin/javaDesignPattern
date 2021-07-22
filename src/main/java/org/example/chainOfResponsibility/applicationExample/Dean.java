package org.example.chainOfResponsibility.applicationExample;

/**
 * @author yangshunxin
 * @create 2021-07-22-15:41
 */
//具体处理者3：院长类
public class Dean extends Leader{
    @Override
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 10) {
            System.out.println("院长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}

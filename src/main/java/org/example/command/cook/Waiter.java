package org.example.command.cook;

/**
 * @author yangshunxin
 * @create 2021-07-22-11:53
 */
//调用者：服务员
public class Waiter {
    private Breakfast changFen, hunTun, heFen;

    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }

    public void chooseChangFen(){
        changFen.cooking();
    }

    public void chooseHunTun(){
        hunTun.cooking();
    }

    public void chooseHeFen(){
        heFen.cooking();
    }
}

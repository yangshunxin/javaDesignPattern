package org.example.observer.ring;

/**
 * @author yangshunxin
 * @create 2021-07-23-14:16
 */
public class StuEventListener implements BellEventListener{
    @Override
    public void hearBell(RingEvent e) {
        if (e.getSound()){
            System.out.println("同学们，上课了。。。");
        }else {
            System.out.println("同学们，下课了。。。");
        }
    }
}

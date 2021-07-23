package org.example.observer.ring;

/**
 * @author yangshunxin
 * @create 2021-07-23-14:16
 */
public class TeachEventListener implements BellEventListener{
    @Override
    public void hearBell(RingEvent e) {
        if (e.getSound()){
            System.out.println("老师上课了。。。");
        }else {
            System.out.println("老师下课了。。。");
        }
    }
}

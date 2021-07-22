package org.example.prototype.rewriteClone;

import java.util.Date;

/**
 * @author yangshunxin
 * @create 2021-07-17-16:17
 *
 * 1.实现一个接口 CLoneable
 * 2.重写一个方法 clone()
 *
 *
 *
 */
public class Video implements Cloneable{

    private String name;
    private Date createTime;

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        // 实现深克隆 ~~~~ 除了这个方法就是序列化和反序列化
        Video v = (Video) obj;
        // 将这个对象的属性也克隆
        v.createTime =(Date) this.createTime.clone();

        return obj;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

package org.example.facade;

/**
 * @author yangshunxin
 * @create 2021-07-18-20:14
 */
// 外观角色
public class Facade {

    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();

    // 延伸：这里提炼出接口，然后就可以往外扩展，实例出不同子系统组合的模块
    public void method(){
        obj1.method01();
        obj2.method02();
        obj3.method03();
    }


}

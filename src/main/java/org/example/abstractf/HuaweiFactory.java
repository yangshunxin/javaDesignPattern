package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:29
 */
public class HuaweiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}

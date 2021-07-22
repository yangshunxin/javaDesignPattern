package org.example.abstractf;

/**
 * @author yangshunxin
 * @create 2021-07-16-14:28
 */
public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}

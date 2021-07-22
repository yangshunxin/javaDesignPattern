package org.example.flyweight.gobang;

import java.awt.*;

/**
 * @author yangshunxin
 * @create 2021-07-18-21:14
 */
//抽象享元角色：棋子
public interface ChessPieces {
    // 所有的子 都有 下的动作
    public void DownPieces(Graphics g, Point pt);    //下子
}

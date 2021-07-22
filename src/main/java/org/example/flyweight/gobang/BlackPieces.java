package org.example.flyweight.gobang;

import java.awt.*;

/**
 * @author yangshunxin
 * @create 2021-07-18-21:17
 */
public class BlackPieces implements ChessPieces{
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}

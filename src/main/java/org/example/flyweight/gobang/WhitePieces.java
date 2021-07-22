package org.example.flyweight.gobang;

import java.awt.*;

/**
 * @author yangshunxin
 * @create 2021-07-18-21:15
 */
public class WhitePieces implements ChessPieces{

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}

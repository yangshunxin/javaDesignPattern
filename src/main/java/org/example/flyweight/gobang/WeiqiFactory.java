package org.example.flyweight.gobang;

import java.util.ArrayList;

/**
 * @author yangshunxin
 * @create 2021-07-18-21:18
 */
// 享元工厂
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;

    public WeiqiFactory() {
        this.qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type){
        if (type.equalsIgnoreCase("w")){
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")){
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }

}

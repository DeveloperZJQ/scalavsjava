package designpatterns.flyweight.demo2;

import java.util.ArrayList;

/**
 * factory
 *
 * @author happy
 * @since 2021-05-08
 */
public class ChessPiecesFactory {
    private ArrayList<ChessPieces> qz;

    public ChessPiecesFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhiteChess();
        qz.add(w);
        ChessPieces b = new BlockChess();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return qz.get(1);
        } else {
            return null;
        }
    }
}

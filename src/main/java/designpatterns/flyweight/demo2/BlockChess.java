package designpatterns.flyweight.demo2;

import java.awt.*;

/**
 * 黑子
 *
 * @author happy
 * @since 2021-05-08
 */
public class BlockChess implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}

package designpatterns.flyweight.demo2;

import java.awt.*;

/**
 * 白子
 *
 * @author happy
 * @since 2021-05-08
 */
public class WhiteChess implements ChessPieces {
    @Override
    public void downPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x,pt.y,30,30);
    }
}

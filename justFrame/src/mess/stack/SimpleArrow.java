package mess.stack;

import java.awt.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SimpleArrow extends Edge{
    SimpleArrow(Point s, Point t){
        super(s, t);
    }

    SimpleArrow(int X0, int Y0, int X1, int Y1){
        super(new Point(X0, Y0), new Point(X1, Y1));
    }

    @Override
    public void move(int dx, int dy) {
        s.x += dx;
        s.y += dy;
        t.x += dx;
        t.y += dy;
    }

    @Override
    public void draw(Graphics2D pic, Rectangle bound) {
        pic.drawLine(s.x, s.y, t.x, t.y);
        Point left =
        pic.drawP
    }

    @Override
    public boolean isPointOn(Point mouseP) {
        /*
        先要求矩形范围内
         */
        if (mouseP.getX() >= min(s.x, t.x)
                && mouseP.getX() <= max(s.x, t.x)
                && mouseP.getY() >= min(s.y, t.y)
                && mouseP.getY() <= max(s.y, t.y)
                ){
            /*
            然后在线附近
             */
            if ((mouseP.getX() - s.x) * (t.y - s.y) == (mouseP.getY() - s.y) * (t.x - s.x)) {
                return true;
            }
        }
        return false;
    }
}

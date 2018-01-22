package mess.stack;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class Grid implements DrawSelf{
    private static final double GRID_SIZE = 10;
    private static final Color GRID_COLOR = new Color(220, 220, 220);
    private int interval;

    private Grid(){}

    /**
     *
     * @param interval 网格间距
     */
    public Grid(int interval)
    {
        this.interval = interval;
    }

    /**
     * 绘制图形网格
     * @param pic
     * @param bound 边界
     */
    public void draw(Graphics2D pic, Rectangle2D bound)
    {
        Color oldColor = pic.getColor();
        pic.setColor(GRID_COLOR);
        Stroke oldStroke = pic.getStroke();
        for(double x = bound.getX() + interval / 2; x < bound.getMaxX(); x += interval)
        {
            pic.draw(new Line2D.Double(x, bound.getY(), x, bound.getMaxY()));
        }
        for(double y = bound.getY() + interval / 2; y < bound.getMaxY(); y += interval)
        {
            pic.draw(new Line2D.Double(bound.getX(), y, bound.getMaxX(), y));
        }
        pic.setColor(oldColor);
        pic.setStroke(oldStroke);
    }
}

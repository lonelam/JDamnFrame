import java.awt.*;
import java.awt.geom.Rectangle2D;

public interface DrawSelf {
    /**
     *
     * @param pic
     * @param bound 整个绘图框的边界
     */
    public void draw(Graphics2D pic, Rectangle2D bound);
}

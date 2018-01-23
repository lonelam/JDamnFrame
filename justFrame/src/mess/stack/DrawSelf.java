package mess.stack;

import java.awt.*;

public interface DrawSelf {
    /**
     * @param pic 通过这个图形对象进行绘图
     * @param bound 整个绘图框的边界
     */
    void draw(Graphics2D pic, Rectangle bound);

    boolean isPointOn(Point mouseP);
}

package mess.stack;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;


public class GraphPanel extends JPanel{
    boolean isGridHide = false;
    Graph G = new Graph();
    void setGridHide()
    {
        isGridHide = true;
    }
    void setGridHide(boolean state)
    {
        isGridHide = state;
    }
    boolean getGridHide()
    {
        return isGridHide;
    }
    Grid grid = new Grid(10);
    GraphPanel()
    {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics graphic)
    {
        super.paintComponent(graphic);
        Graphics2D g2 = (Graphics2D) graphic;
        Rectangle2D bounds = getBounds();
        if (!isGridHide) grid.draw(g2, bounds);
        G.draw(g2, bounds);
    }


}

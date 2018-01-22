package mess.stack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;


public class GraphPanel extends JPanel{
    private boolean isGridHide = false;
    private Graph G = new Graph();
    private Grid grid = new Grid(10);

    public void setGridHide()
    {
        isGridHide = true;
    }
    public void setGridHide(boolean state)
    {
        isGridHide = state;
    }
    public boolean getGridHide()
    {
        return isGridHide;
    }

    public GraphPanel()
    {
        setBackground(Color.WHITE);
        addMouseListener(new GraphPanelMouseListener());
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

    /**
     * 从这里往下都是处理鼠标事件的部分
     */
    private class GraphPanelMouseListener extends MouseAdapter
    {
        /**
         * 这个事件用于处理拖拽
         * @param e
         */
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
        }

        /**
         * 这个用来处理点击
         * @param e
         */
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if(e.getClickCount() == 2)
            {
                System.out.println("double clicked");
            }
            System.out.println(e.getPoint().toString());
        }
    }


}

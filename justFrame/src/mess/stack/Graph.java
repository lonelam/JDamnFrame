package mess.stack;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Graph implements DrawSelf{
    ArrayList<Node> nodes = new ArrayList<>();

    Graph() {
    }

    @Override
    public void draw(Graphics2D pic, Rectangle2D bound) {
        for (Node node: nodes)
        {
        }
        pic.draw(new Ellipse2D.Double(bound.getX(), bound.getY(),bound.getMaxX() - bound.getMinX(), bound.getHeight()));
    }
}

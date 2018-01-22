package mess.stack;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Graph implements DrawSelf{
    private ArrayList<Node> nodes = new ArrayList<>();

    Graph() {
        nodes.add(new RectNode(100, 50, 500, 430));
    }

    @Override
    public void draw(Graphics2D pic, Rectangle2D bound) {
        for (Node node: nodes)
        {
            node.draw(pic, bound);
        }
    }
}

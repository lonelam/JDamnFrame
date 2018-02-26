package mess.stack;

import java.awt.*;
import java.util.ArrayList;

public class Graph implements DrawSelf {
    private ArrayList<Node> nodes = new ArrayList<>();
    private ArrayList<Edge> edges = new ArrayList<>();
    //the node in action or been selected
    private int actor = -1;
    private Rectangle boundBuffer = new Rectangle(0, 0);

    Graph() {
        /*
        默认初始图，测试用，后期删除
         */
        nodes.add(new RectNode(100, 50, 500, 430));
        edges.add(new SimpleArrow(110, 60, 510, 440));
    }

    @Override
    public void draw(Graphics2D pic, Rectangle bound) {
        for (Node node : nodes) {
            node.draw(pic, bound);
        }
        for (Edge edge: edges){
            edge.draw(pic, bound);
        }
        boundBuffer = bound;
    }

    @Override
    public boolean isPointOn(Point mouseP) {
        if (mouseP.getX() >= boundBuffer.getX() && mouseP.getY() >= boundBuffer.getY()
                && mouseP.getX() <= boundBuffer.getMaxX() && mouseP.getY() <= boundBuffer.getMaxY()) {
            return true;
        }
        return false;
    }

    /**
     * @param mouseP
     * @return 当前激活的Node
     */
    public Node activate(Point mouseP) {
        actor = -1;
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).isPointOn(mouseP)) {
                actor = i;
                break;
            }
        }
        return getActor();
    }

    public void newNode(Node node)
    {
        actor = nodes.size();
        nodes.add(node);
    }
    public Node getActor() {
        if (actor == -1) {
            return null;
        }
        return nodes.get(actor);
    }
    public void deleteActor()
    {
        if (actor == -1) return;
        nodes.remove(actor);
    }
}

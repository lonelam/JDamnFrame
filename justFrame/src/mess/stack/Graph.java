package mess.stack;

import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;

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

    public void newEdge(Edge edge) {
        edges.add(edge);
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
        actor = -1;
    }
    public Edge actEdge(Point mouseP){
        for (Edge e: edges)
        {
            if (e.isPointOn(mouseP))
            {
                return e;
            }
        }
        return null;
    }
    public void deleteEdge(Edge e)
    {
        if (e == null) return;
        edges.remove(e);
    }

    public Vector<Point> getLinkPoint(){
        if (actor == -1)
            return  new Vector<>();
        Vector<Point> ret = new Vector<>();
        for (Edge e: edges)
        {
            Node v = getActor();
            if(v.isPointOn(e.s))
            {
                ret.add(e.s);
//                System.out.println(e.s.toString()+ " in " + v.getX() + " , " + v.getY());
            }
            if (v.isPointOn(e.t))
            {
                ret.add(e.t);
//                System.out.println(e.t.toString()+ " in "+ v.getX() + " , " + v.getY());
            }
        }
        return ret;
    }


}

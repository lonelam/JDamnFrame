package mess.stack;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class SelectionTool extends Tool{
    private Point mouseBuffer;
    private boolean dragging = false;
    SelectionTool()
    {
        setToolName("SelectionTool");
    }
    @Override
    public void doubleClicked(MouseEvent e, Graph G) {
        Node act = G.getActor();
        if (act != null) {

        }

    }

    @Override
    public void singleClicked(MouseEvent e, Graph G) {

    }

    @Override
    public void mouseDown(MouseEvent e, Graph G) {
        Node act = G.activate(e.getPoint());
        if (act != null) {
            dragging = true;
            mouseBuffer = e.getPoint();
        }
    }

    @Override
    public void mouseUp(MouseEvent e, Graph G) {
        dragging = false;
    }

    @Override
    public void mouseDrag(MouseEvent e, Graph G) {
        if (dragging) {
            Node act = G.getActor();
            if (act != null) {
                Vector<Point> linkers = G.getLinkPoint();
                act.move((int) (e.getPoint().getX() - mouseBuffer.getX()), (int) (e.getPoint().getY() - mouseBuffer.getY()));
                for (Point p: linkers)
                {
                    p.x += (int) (e.getPoint().getX() - mouseBuffer.getX());
                    p.y += (int) (e.getPoint().getY() - mouseBuffer.getY());
                }
            }
            mouseBuffer = e.getPoint();
        }
    }
}

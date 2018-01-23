package mess.stack;

import java.awt.*;
import java.awt.event.MouseEvent;

public class RectNodeTool extends Tool{
    private Point mouseBuffer, startPoint;
    private boolean dragging = false;
    RectNodeTool()
    {
        setToolName("RectNodeTool");
    }

    @Override
    public void doubleClicked(MouseEvent e, Graph G) {

    }

    @Override
    public void singleClicked(MouseEvent e, Graph G) {

    }

    @Override
    public void mouseDrag(MouseEvent e, Graph G) {
        if (dragging)
        {
            mouseBuffer = e.getPoint();
            G.getActor().update(startPoint.x, startPoint.y, mouseBuffer.x, mouseBuffer.y);
        }
    }

    @Override
    public void mouseUp(MouseEvent e, Graph G) {
        dragging = false;
    }

    @Override
    public void mouseDown(MouseEvent e, Graph G) {
        dragging = true;
        startPoint = e.getPoint();
        G.newNode(new RectNode(startPoint.x, startPoint.y, startPoint.x, startPoint.y));
    }
}

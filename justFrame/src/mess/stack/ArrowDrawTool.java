package mess.stack;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ArrowDrawTool extends Tool{
    private Point mouseBuffer, startPoint;
    private boolean dragging = false;
    private SimpleArrow arrowBuffer = null;
    ArrowDrawTool()
    {
        setToolName("SimpleArrowTool");
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
            arrowBuffer.t.setLocation(mouseBuffer);
//            G.getActor().update(startPoint.x, startPoint.y, mouseBuffer.x, mouseBuffer.y);
        }
    }

    @Override
    public void mouseUp(MouseEvent e, Graph G) {
        dragging = false;
        arrowBuffer = null;
    }

    @Override
    public void mouseDown(MouseEvent e, Graph G) {
        dragging = true;
        startPoint = e.getPoint();
        arrowBuffer = new SimpleArrow(startPoint.x, startPoint.y, startPoint.x, startPoint.y);
        G.newEdge(arrowBuffer);
    }
}

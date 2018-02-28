package mess.stack;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
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
        String stringArray[] = { "<<extends>>", "<<include>>", "<<whatever>>" };
        arrowBuffer.setTextline(stringArray[JOptionPane.showOptionDialog(e.getComponent(), "What type of relationship do you want?", "type Selection",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, stringArray[0])]);
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

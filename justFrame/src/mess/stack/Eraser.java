package mess.stack;

import java.awt.event.MouseEvent;

public class Eraser extends Tool{
    Eraser()
    {
        setToolName("Eraser");
    }
    @Override
    public void doubleClicked(MouseEvent e, Graph G) {

    }

    @Override
    public void singleClicked(MouseEvent e, Graph G) {
        G.activate(e.getPoint());
        G.deleteActor();
        G.deleteEdge(G.actEdge(e.getPoint()));
    }

    @Override
    public void mouseDown(MouseEvent e, Graph G) {

    }

    @Override
    public void mouseUp(MouseEvent e, Graph G) {

    }

    @Override
    public void mouseDrag(MouseEvent e, Graph G) {

    }
}

package mess.stack;

import java.awt.event.MouseEvent;

public abstract class Tool {
    public abstract void doubleClicked(MouseEvent e, Graph G);

    public abstract void singleClicked(MouseEvent e, Graph G);

    public abstract void mouseDown(MouseEvent e, Graph G);

    public abstract void mouseUp(MouseEvent e, Graph G);

    public abstract void mouseDrag(MouseEvent e, Graph G);

}

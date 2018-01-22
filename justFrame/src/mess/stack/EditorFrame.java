package mess.stack;

import java.awt.*;


public class EditorFrame extends Frame{
    public EditorFrame(String title)
    {
        setTitle(title);
        setSize(1024, 768);
        ToolBar toolBar = new ToolBar();
        GraphPanel graphPanel = new GraphPanel();
        add(toolBar, BorderLayout.EAST);
        add(graphPanel, BorderLayout.CENTER);
    }
}
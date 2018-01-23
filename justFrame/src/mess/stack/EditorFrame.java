package mess.stack;

import java.awt.*;


class EditorFrame extends Frame {
    GraphPanel graphPanel;
    ToolBar toolBar;
    EditorFrame(String title) {
        setTitle(title);
        setSize(1024, 768);

        graphPanel = new GraphPanel();
        toolBar = new ToolBar(graphPanel);
        add(toolBar, BorderLayout.EAST);
        add(graphPanel, BorderLayout.CENTER);
    }
}

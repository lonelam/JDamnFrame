package mess.stack;

import javax.swing.*;
import java.awt.*;


class EditorFrame extends JFrame {
    GraphPanel graphPanel;
    ToolBar toolBar;
    EditorFrame(String title) {
        setTitle(title);
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphPanel = new GraphPanel();
        toolBar = new ToolBar(graphPanel);
        add(toolBar, BorderLayout.EAST);
        add(graphPanel, BorderLayout.CENTER);
    }
}

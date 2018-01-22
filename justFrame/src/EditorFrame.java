import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static javafx.application.Platform.exit;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


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

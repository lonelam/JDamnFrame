package mess.stack;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

class ToolBar extends JPanel{
    ButtonGroup bgroup = new ButtonGroup();
    GraphPanel panel;
    ArrayList<Tool> toolList = new ArrayList<>();

    /**
     * 添加一个Tool对应的按钮
     */
    private class ToolButton extends JRadioButton {
        ToolButton(String Text, int index) {
            super(Text);
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panel.setCurrentTool(toolList.get(index));
                }
            });
        }
    }

    ToolBar(GraphPanel graphPanel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        panel = graphPanel;
        //工具列表
        toolList.add(new SelectionTool());
        toolList.add(new RectNodeTool());
        toolList.add(new Eraser());
        for (int i = 0; i < toolList.size(); i++)
        {
            JRadioButton button = new ToolButton(toolList.get(i).getToolName(), i);
            bgroup.add(button);
            add(button);
            if (i == 0)
            {
                button.doClick();
            }
        }

    }
}

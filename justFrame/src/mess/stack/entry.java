package mess.stack;

import javax.swing.*;
import java.rmi.server.ExportException;

public class entry {
    public static void main(String[] args) {
        EditorFrame mFindow = new EditorFrame("nice");
        try
        {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.out.println("载入风格期间发生错误");
        }
        SwingUtilities.updateComponentTreeUI(mFindow);
        mFindow.setVisible(true);
    }
}

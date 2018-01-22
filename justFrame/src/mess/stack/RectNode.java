package mess.stack;

import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Collection;

import static javax.swing.SwingConstants.LEFT;

public class RectNode extends Node{
    String text = "test";
    public RectNode(int X0, int Y0, int X1, int Y1){
        super(X0, Y0, X1, Y1);
        for (int i = 0; i < 5; i++)
        {
            text = text + text;
        }
    }
    @Override
    public void draw(Graphics2D pic, Rectangle2D bound) {
        JTextArea label = new JTextArea(text);
        label.setBounds(0, 0, getWidth(), getHeight());
        label.setLineWrap(true);
        pic.translate(getX(), getY());
        label.paint(pic);
        pic.translate(-getX(), -getY());
        pic.drawRect(getX(), getY(), getWidth(), getHeight());
    }
}
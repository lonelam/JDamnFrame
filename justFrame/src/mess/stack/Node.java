package mess.stack;

import java.awt.*;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public abstract class Node implements DrawSelf, Movable {
    private int x, y, width, height;

    private Node() {
    }

    public Node(int X0, int Y0, int X1, int Y1) {
        x = min(X0, X1);
        y = min(Y0, Y1);
        width = abs(X0 - X1);
        height = abs(Y0 - Y1);
    }

    public Node(Point p0, Point p1) {
        this((int) p0.getX(), (int) p0.getY(), (int) p1.getX(), (int) p1.getY());
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("move" + dx + ", " + dy);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

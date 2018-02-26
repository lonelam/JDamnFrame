package mess.stack;

import java.awt.*;

public abstract class Edge implements DrawSelf, Movable{
    public Point s, t;
    public Edge(){

    }
    public Edge(Point s, Point t){
        this.s = s;
        this.t = t;
    }
}

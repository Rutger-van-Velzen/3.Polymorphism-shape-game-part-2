package org.example.Shapes;

import org.example.Panel;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyCircle implements Drawable{
    public MyCircle(){
        Panel.addDrawable(this);
    }

    public void draw(Graphics2D g2d) {
//        final DrawInstructions drawInstructions = new DrawInstructions();
//        drawInstructions.setColor(Color.BLUE);
//        drawInstructions.setShape(new Ellipse2D.Double(100, 100, 50, 50));
//


        g2d.setColor(Color.BLUE);
        g2d.fill(new Ellipse2D.Double(100, 100, 50, 50));
    }

}

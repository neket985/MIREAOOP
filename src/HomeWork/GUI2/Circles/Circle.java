package homework.GUI2.Circles;

import java.awt.*;
public class Circle {
    private int diameter, x, y;
    private Color color;

    public Circle(int size, Color shade, int upperX, int upperY) {
        diameter = size;
        color = shade;
        x = upperX;
        y = upperY;
    }

    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(x, y, diameter, diameter);
    }

    //  Diameter mutator.
    public void setDiameter(int size) {
        diameter = size;
    }

    //  Color mutator.
    public void setColor(Color shade) {
        color = shade;
    }

    //  X mutator.
    public void setX(int upperX) {
        x = upperX;
    }

    //  Y mutator.
    public void setY(int upperY) {
        y = upperY;
    }

}





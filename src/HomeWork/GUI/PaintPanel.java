package HomeWork.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class PaintPanel extends JPanel
{
    Random rand = new Random();
    @Override
    public void paint(Graphics g)
    {
        g.drawOval(5, 0, 690, 735);
        for (int i = 0; i < 3; i++){
         drawCircle(g, rand.nextInt(400), rand.nextInt(400), rand.nextInt(400));
        }

    }

    private void drawCircle(Graphics g, int x, int y, int rad){
        g.drawOval(x - rad, y - rad, rad*2, rad*2);
    }
}

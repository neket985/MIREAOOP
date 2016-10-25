package homework.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class PaintPanel extends JPanel
{
    Random rand = new Random();
    @Override
    public void paint(Graphics g)
    {
        //рандомные прямоугольники
        g.setColor(Color.blue);
        for (int i = 0; i < 3; i++){
            //g.drawRect(rand.nextInt(400), rand.nextInt(400), rand.nextInt(400), rand.nextInt(400));
            g.fillRect(rand.nextInt(400), rand.nextInt(400), rand.nextInt(400), rand.nextInt(400));
        }
        g.setColor(Color.cyan);
        //рандомные квадраты
        for (int i = 0; i < 3; i++){
            int rando;
            rando = rand.nextInt(400);
            g.drawRect(rand.nextInt(400), rand.nextInt(400), rando, rando);
        }
        g.setColor(Color.green);
        g.drawOval(5, 0, 690, 735);
        for (int i = 0; i < 3; i++){
         drawCircle(g, rand.nextInt(400), rand.nextInt(400), rand.nextInt(400));
        }

    }

    private void drawCircle(Graphics g, int x, int y, int rad){
        g.drawOval(x - rad, y - rad, rad*2, rad*2);
    }
}

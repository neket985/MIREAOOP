package homework.GUI;
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Label Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("/home/liveuser/IdeaProjects/OOP_MIREA/src/HomeWork/GUI/Cat2.jpeg");

        JLabel label1, label2, label3,label4;
        // Set up first subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize (new Dimension(700, 750));
        subPanel1.setBackground (Color.green);
        //label1 = new JLabel ("one");
        //subPanel1.add (label1);

        // Set up second subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize (new Dimension(700, 750));
        subPanel2.setBackground (Color.red);
        //label2 = new JLabel("two");
//        subPanel2.add (label2);

        PaintPanel pan = new PaintPanel();
        pan.setPreferredSize(new Dimension(700, 750));
        subPanel2.add(pan);


        // Set up primary panel
        JPanel panel = new JPanel();
        panel.setBackground (Color.yellow);
        panel.setPreferredSize (new Dimension (1600, 800));
        panel.add (subPanel1);
        panel.add (subPanel2);


        label3 = new JLabel ("Милота сверху", icon, SwingConstants.LEFT);
        label3.setHorizontalTextPosition (SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.BOTTOM);


        label4 = new JLabel("Милота справа", icon, SwingConstants.CENTER);
        label4.setHorizontalTextPosition (SwingConstants.LEFT);
        label4.setVerticalTextPosition (SwingConstants.CENTER);

        subPanel1.add (label3);
        subPanel1.add (label4);



        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }


    void Circle(Graphics g, int x, int y, int radius){
        g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
    }
}

package homework.GUI2.Circles;

import javax.swing.*;


public class Splat {
    public static void main (String[] args)  {
        JFrame frame = new JFrame ("Splat");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new SplatPanel());

        frame.pack();
        frame.setVisible(true);
    }
}
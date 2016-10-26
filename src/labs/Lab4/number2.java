package labs.Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nikitos on 23.10.16
 */
public class number2 {
    static JButton bt1 = new JButton("Red");
    static JButton bt2 = new JButton("Green");
    static JButton bt3 = new JButton("White");
    static JButton bt4 = new JButton("Blue");
    static JFrame frame = new JFrame("Test");

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        MyListener ml = new MyListener();
        bt1.addActionListener(ml);
        bt2.addActionListener(ml);
        bt3.addActionListener(ml);
        bt4.addActionListener(ml);
        frame.setLayout(new FlowLayout());
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.setVisible(true);
    }

    public static class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Color clr;
            if (e.getSource() == bt1) {
                clr = new Color(255, 0, 0);
            } else if (e.getSource() == bt2) {
                clr = new Color(0, 255, 0);
            } else if (e.getSource() == bt3) {
                clr = new Color(255, 255, 255);
            } else
                clr = new Color(0, 0, 255);
            frame.getContentPane().setBackground(clr);
        }
    }
}

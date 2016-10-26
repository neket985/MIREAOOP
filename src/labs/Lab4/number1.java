package labs.Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nikitos on 21.10.16.
 */
public class number1 {
    static int i1 =0, i2 =0;
    static String lstSock = "N/A";
    static String wnnr = "DRAW";

    static JFrame swg = new JFrame("Test");
    static javax.swing.JButton swgButton1 = new javax.swing.JButton("AC Milan");
    static javax.swing.JButton swgButton2 = new javax.swing.JButton("Real Madrid");
    static JLabel lbl1 = new JLabel("Result: " + i1 + " X "+ i2);
    static JLabel lbl2 = new JLabel("Last Scorer. " + lstSock);
    static Label lbl3 = new Label("Winer: " + wnnr);
    public static void main(String[] args) {
        swg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i1 = 0;
        i2 = 0;
        lstSock = "N/A";
        wnnr = "DRAW";
        MyListener ml = new MyListener();
        swgButton1.addActionListener(ml);
        swgButton2.addActionListener(ml);
        swg.setSize(600, 400);
        swg.setLayout(new java.awt.FlowLayout());
        swg.add(swgButton1);
        swg.add(swgButton2);
        swg.add(lbl1);
        swg.add(lbl2);
        swg.add(lbl3);
        swg.setVisible(true);
    }

    public static class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == swgButton1) {
                ++i1;
                lstSock = "AC Milan";
            }
            else  {
                ++i2;
                lstSock = "Real Madrid";
            }
            if (i1 > i2) {
                wnnr = "AC Milan";
            } else if (i2 > i1) {
                wnnr = "Real Madrid";
            } else wnnr = "DRAW";
            lbl1.setText("Result: " + i1 + " X "+ i2);
            lbl2.setText("Last Scorer. " + lstSock);
            lbl3.setText("Winer: " + wnnr);
        }


    }
}

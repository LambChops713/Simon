package Scratch2x2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanMain extends JPanel {

    int i, j, k, nCounter = 0;
    boolean bGame = true;
    ArrayList<Integer> alsPattern;
    public ArrayList<Integer> alsUser;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    public PanMain() {
        alsPattern = new ArrayList();
        alsUser = new ArrayList();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();

        btn1.setBackground(new Color(0, 255, 0));
        btn2.setBackground(new Color(255, 0, 0));
        btn3.setBackground(new Color(255, 255, 0));
        btn4.setBackground(new Color(0, 0, 255));

        setLayout(new GridLayout(2, 2));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
    }

    public void buttonFlash() {
        btnListener btnPressed = new btnListener();

        btn1.addActionListener(btnPressed);
        btn2.addActionListener(btnPressed);
        btn3.addActionListener(btnPressed);
        btn4.addActionListener(btnPressed);

        for (i = 0; i < 30; i++) {
            alsUser.clear();
            alsPattern.add((int) (Math.random() * 4 + 1));

            Delay(1500);
            for (j = 0; j < alsPattern.size(); j++) {
                if (alsPattern.get(j) == 1) {
                    btn1.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn1.setBackground(new Color(0, 255, 0));
                    Delay(100);
                    //System.out.println("green");
                } else if (alsPattern.get(j) == 2) {
                    btn2.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn2.setBackground(new Color(255, 0, 0));
                    Delay(100);
                    //System.out.println("red");
                } else if (alsPattern.get(j) == 3) {
                    btn3.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn3.setBackground(new Color(255, 255, 0));
                    Delay(100);
                    //System.out.println("yellow");
                } else if (alsPattern.get(j) == 4) {
                    btn4.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn4.setBackground(new Color(0, 0, 255));
                    Delay(100);
                    //System.out.println("blue");
                }
            }

            while (alsUser.size() < alsPattern.size()) {
                if (btn1.getModel().isPressed()) { //http://stackoverflow.com/questions/20799131/how-can-i-check-that-jbutton-is-pressed-if-the-isenable-is-not-work
                    alsUser.add(1);
                } else if (btn2.getModel().isPressed()) {
                    alsUser.add(2);
                } else if (btn3.getModel().isPressed()) {
                    alsUser.add(3);
                } else if (btn4.getModel().isPressed()) {
                    alsUser.add(4);
                }
                Delay(50);
            }

            for (k = 0; k < alsPattern.size(); k++) {
                if (alsUser.get(k) == alsPattern.get(k)) {
                    nCounter++;
                }
            }

            if (nCounter == alsPattern.size()) {
            } else {
            }
            nCounter = 0;
        }
    }

    public void Delay(int n) {
        try {
            Thread.sleep(n);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class btnListener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package Scratch3x3;

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
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;
    JButton btn12;
    JButton btn13;
    JButton btn14;
    JButton btn15;
    JButton btn16;

    public PanMain() {
        alsPattern = new ArrayList();
        alsUser = new ArrayList();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btn10 = new JButton();
        btn11 = new JButton();
        btn12 = new JButton();
        btn13 = new JButton();
        btn14 = new JButton();
        btn15 = new JButton();
        btn16 = new JButton();


        btn1.setBackground(new Color(0, 255, 0));
        btn2.setBackground(new Color(255, 0, 0));
        btn3.setBackground(new Color(255, 255, 0));
        btn4.setBackground(new Color(0, 0, 255));
        btn5.setBackground(new Color(102, 0, 204));
        btn6.setBackground(new Color(255, 0, 127));
        btn7.setBackground(new Color(255, 128, 0));
        btn8.setBackground(new Color(128, 128, 128));
        btn9.setBackground(new Color(0, 0, 102));
        btn1.setBackground(new Color(0, 255, 0));
        btn2.setBackground(new Color(255, 0, 0));
        btn3.setBackground(new Color(255, 255, 0));
        btn4.setBackground(new Color(0, 0, 255));
        btn5.setBackground(new Color(102, 0, 204));
        btn6.setBackground(new Color(255, 0, 127));
        btn7.setBackground(new Color(255, 128, 0));

        setLayout(new GridLayout(3, 3));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
    }

    public void buttonFlash() {
        btnListener btnPressed = new btnListener();

        btn1.addActionListener(btnPressed);
        btn2.addActionListener(btnPressed);
        btn3.addActionListener(btnPressed);
        btn4.addActionListener(btnPressed);
        btn5.addActionListener(btnPressed);
        btn6.addActionListener(btnPressed);
        btn7.addActionListener(btnPressed);
        btn8.addActionListener(btnPressed);
        btn9.addActionListener(btnPressed);

        for (i = 0; i < 30; i++) {
            alsUser.clear();
            alsPattern.add((int) (Math.random() * 9 + 1));

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
                } else if (alsPattern.get(j) == 5) {
                    btn5.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn5.setBackground(new Color(102, 0, 204));
                    Delay(100);
                    //System.out.println("purple");
                } else if (alsPattern.get(j) == 6) {
                    btn6.setBackground(new Color(229, 204, 255));
                    Delay(400);
                    btn6.setBackground(new Color(255, 0, 127));
                    Delay(100);
                    //System.out.println("pink");
                } else if (alsPattern.get(j) == 7) {
                    btn7.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn7.setBackground(new Color(255, 128, 0));
                    Delay(100);
                    //System.out.println("orange");
                } else if (alsPattern.get(j) == 8) {
                    btn8.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn8.setBackground(new Color(128, 128, 128));
                    Delay(100);
                    //System.out.println("gray");
                } else if (alsPattern.get(j) == 9) {
                    btn9.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn9.setBackground(new Color(0, 0, 102));
                    Delay(100);
                    //System.out.println("dark blue");
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
                } else if (btn5.getModel().isPressed()) {
                    alsUser.add(5);
                } else if (btn6.getModel().isPressed()) {
                    alsUser.add(6);
                } else if (btn7.getModel().isPressed()) {
                    alsUser.add(7);
                } else if (btn8.getModel().isPressed()) {
                    alsUser.add(8);
                } else if (btn9.getModel().isPressed()) {
                    alsUser.add(9);
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
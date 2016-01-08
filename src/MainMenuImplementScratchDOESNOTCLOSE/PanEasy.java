package MainMenuImplementScratchDOESNOTCLOSE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PanEasy extends JPanel {

    Map<Character, Integer> map = new HashMap<>(); //https://github.com/Mrgfhci/Cards
    int i, j, k;
    boolean bGame = true;
    ArrayList<Integer> alsPattern;
    public ArrayList<Integer> alsUser;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    //PanProgressBar panProgressBar = new PanProgressBar();

    public PanEasy() {
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

        
        
        System.out.println("PanEasy");
        JFrame frame = new JFrame("Simon");
        this.setLayout(new GridLayout(2, 2));
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        this.setVisible(true);
       // add(panProgressBar, BorderLayout.SOUTH);
        setLayout(new GridLayout(2, 2));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);


        
        frame.setVisible(true);

    }
    public void buttonFlash() {

        btn1Listener btn1Pressed = new btn1Listener();
        btn2Listener btn2Pressed = new btn2Listener();
        btn3Listener btn3Pressed = new btn3Listener();
        btn4Listener btn4Pressed = new btn4Listener();

        btn1.addActionListener(btn1Pressed);
        btn2.addActionListener(btn2Pressed);
        btn3.addActionListener(btn3Pressed);
        btn4.addActionListener(btn4Pressed);

        for (i = 0; i < 30; i++) {
            alsUser.clear();
            alsPattern.add((int) (Math.random() * 4 + 1));

            Delay(1);
            for (j = 0; j < alsPattern.size(); j++) {
                if (alsPattern.get(j) == 1) {
                    btn1.setBackground(new Color(255, 255, 255));
                    Delay(1);
                    btn1.setBackground(new Color(0, 255, 0));
                    Delay(1);
                    System.out.println("green");
                } else if (alsPattern.get(j) == 2) {
                    btn2.setBackground(new Color(255, 255, 255));
                    Delay(1);
                    btn2.setBackground(new Color(255, 0, 0));
                    Delay(1);
                    System.out.println("red");
                } else if (alsPattern.get(j) == 3) {
                    btn3.setBackground(new Color(255, 255, 255));
                    Delay(1);
                    btn3.setBackground(new Color(255, 255, 0));
                    Delay(1);
                    System.out.println("yellow");
                } else if (alsPattern.get(j) == 4) {
                    btn4.setBackground(new Color(255, 255, 255));
                    Delay(1);
                    btn4.setBackground(new Color(0, 0, 255));
                    Delay(1);
                    System.out.println("blue");
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
                Delay(1);

                for (i = 0; i < alsUser.size(); i++) {
                    if (alsUser.get(i) == alsPattern.get(i)) {
                        
                    } else {
                        System.out.println("Game Over");
                    }
                }
            }
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

class btn1Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class btn2Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class btn3Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class btn4Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

   

/*package TrueSimon1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanEasy extends JPanel {

    int i, j, k;
    boolean bGame = true;
    ArrayList<Integer> alsPattern;
    public ArrayList<Integer> alsUser;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    public PanEasy() {
        System.out.println("hi");
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
        btn1Listener btn1Pressed = new btn1Listener();
        btn2Listener btn2Pressed = new btn2Listener();
        btn3Listener btn3Pressed = new btn3Listener();
        btn4Listener btn4Pressed = new btn4Listener();

        btn1.addActionListener(btn1Pressed);
        btn2.addActionListener(btn2Pressed);
        btn3.addActionListener(btn3Pressed);
        btn4.addActionListener(btn4Pressed);

        for (i = 0; i < 30; i++) {
            alsUser.clear();
            alsPattern.add((int) (Math.random() * 4 + 1));

            Delay(2000);
            for (j = 0; j < alsPattern.size(); j++) {
                if (alsPattern.get(j) == 1) {
                    btn1.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn1.setBackground(new Color(0, 255, 0));
                    Delay(100);
                    System.out.println("green");
                } else if (alsPattern.get(j) == 2) {
                    btn2.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn2.setBackground(new Color(255, 0, 0));
                    Delay(100);
                    System.out.println("red");
                } else if (alsPattern.get(j) == 3) {
                    btn3.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn3.setBackground(new Color(255, 255, 0));
                    Delay(100);
                    System.out.println("yellow");
                } else if (alsPattern.get(j) == 4) {
                    btn4.setBackground(new Color(255, 255, 255));
                    Delay(400);
                    btn4.setBackground(new Color(0, 0, 255));
                    Delay(100);
                    System.out.println("blue");
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
                Delay(100);

                for (i = 0; i < alsUser.size(); i++) {
                    if (alsUser.get(i) == alsPattern.get(i)) {
                        
                    } else {
                        System.out.println("Game Over");
                    }
                }
            }
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

class btn1Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class btn2Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class btn3Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class btn4Listener implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        try {
            Thread.sleep(200);                 //1000 milliseconds is one second.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}*/
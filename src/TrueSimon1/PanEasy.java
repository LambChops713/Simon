package TrueSimon1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class PanEasy extends JPanel implements KeyListener {
    Map<Character, Integer> map = new HashMap<>(); //https://github.com/Mrgfhci/Cards
    public PanEasy() {
        PanProgressBar panProgressBar = new PanProgressBar();
        add(panProgressBar, BorderLayout.SOUTH);
        System.out.println("PanEasy");
        JFrame frame = new JFrame("Simon");
        this.setLayout(new GridLayout(2, 2));
        map.put('q', 0);
        map.put('w', 1);
        map.put('a', 2);
        map.put('s', 3);
        addKeyListener(this);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        final JButton GreenButton = new JButton();
        GreenButton.setBounds(0, 0, 300, 300);
        GreenButton.setBackground(Color.green);

        final JButton RedButton = new JButton();
        RedButton.setBounds(300, 0, 600, 300);
        RedButton.setBackground(Color.red);

        final JButton YellowButton = new JButton();
        YellowButton.setBounds(0, 300, 300, 600);
        YellowButton.setBackground(Color.yellow);

        final JButton BlueButton = new JButton();
        BlueButton.setBounds(300, 300, 600, 600);
        BlueButton.setBackground(Color.blue);


        frame.add(GreenButton);
        frame.add(RedButton);
        frame.add(BlueButton);
        frame.add(YellowButton);
        frame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenuScratch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class PanMedium extends JPanel implements KeyListener {

    Map<Character, Integer> map = new HashMap<>(); //https://github.com/Mrgfhci/Cards
    PanProgressBar panProgressBar = new PanProgressBar();

    public PanMedium() {
        System.out.println("PanEasy");
        JFrame frame = new JFrame("Simon");
        this.setLayout(new GridLayout(3, 3));
        map.put('q', 0);
        map.put('w', 1);
        map.put('a', 2);
        map.put('s', 3);
        addKeyListener(this);
        frame.setSize(615, 625);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        add(panProgressBar, BorderLayout.SOUTH);

        final JButton GreenButton = new JButton();
        UIManager.put("Button.select", new Color(51, 0, 0)); //http://www.dreamincode.net/forums/topic/181079-alterting-jbutton-selected-color/
        GreenButton.setBounds(0, 0, 200, 200);
        GreenButton.setBackground(Color.green);

        final JButton RedButton = new JButton();
        RedButton.setBounds(200, 0, 200, 200);
        RedButton.setBackground(Color.red);

        final JButton YellowButton = new JButton();
        YellowButton.setBounds(400, 0, 200, 200);
        YellowButton.setBackground(Color.yellow);

        final JButton BlueButton = new JButton();
        BlueButton.setBounds(0, 200, 200, 200);
        BlueButton.setBackground(Color.blue);

        final JButton OrangeButton = new JButton();
        OrangeButton.setBounds(200, 200, 200, 200);
        OrangeButton.setBackground(new Color(255,128,0));

        final JButton PurpleButton = new JButton();
        PurpleButton.setBounds(400, 200, 200, 200);
        PurpleButton.setBackground(new Color(127,0,255));

        final JButton PinkButton = new JButton();
        PinkButton.setBounds(0, 400, 200, 200);
        PinkButton.setBackground(new Color(255,0,255));

        final JButton GreyButton = new JButton();
        GreyButton.setBounds(200, 400, 200, 200);
        GreyButton.setBackground(new Color(96,96,96));

        final JButton BBlueButton = new JButton();
        BBlueButton.setBounds(400, 400, 200, 200);
        BBlueButton.setBackground(new Color(0,255,255));



        frame.add(GreenButton);
        frame.add(RedButton);
        frame.add(BlueButton);
        frame.add(YellowButton);
        frame.add(OrangeButton);
        frame.add(PurpleButton);
        frame.add(PinkButton);
        frame.add(GreyButton);
        frame.add(BBlueButton);
        frame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

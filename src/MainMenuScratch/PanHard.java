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

public class PanHard extends JPanel implements KeyListener {

    Map<Character, Integer> map = new HashMap<>(); //https://github.com/Mrgfhci/Cards
    PanProgressBar panProgressBar = new PanProgressBar();

    public PanHard() {
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
        GreenButton.setBounds(0, 0, 150, 150);
        GreenButton.setBackground(Color.green);

        final JButton RedButton = new JButton();
        RedButton.setBounds(150, 0, 150, 150);
        RedButton.setBackground(Color.red);

        final JButton YellowButton = new JButton();
        YellowButton.setBounds(300, 0, 150, 150);
        YellowButton.setBackground(Color.yellow);

        final JButton DBlueButton = new JButton();
        DBlueButton.setBounds(450, 0, 150, 150);
        DBlueButton.setBackground(Color.blue);

        final JButton OrangeButton = new JButton();
        OrangeButton.setBounds(0, 150, 150, 150);
        OrangeButton.setBackground(new Color(255,128,0));

        final JButton PurpleButton = new JButton();
        PurpleButton.setBounds(150, 150, 150, 150);
        PurpleButton.setBackground(new Color(127,0,255));

        final JButton PinkButton = new JButton();
        PinkButton.setBounds(300, 150, 150, 150);
        PinkButton.setBackground(new Color(255,0,255));

        final JButton GreyButton = new JButton();
        GreyButton.setBounds(450, 150, 150, 150);
        GreyButton.setBackground(new Color(96,96,96));

        final JButton BBlueButton = new JButton();
        BBlueButton.setBounds(0, 300,150, 150);
        BBlueButton.setBackground(new Color(0,255,255));

        final JButton LGreenButton = new JButton();
        LGreenButton.setBounds(150, 300, 150, 150);
        LGreenButton.setBackground(new Color(0,255,128));

        final JButton BlueButton = new JButton();
        BlueButton.setBounds(300, 300, 150, 150);
        BlueButton.setBackground(new Color(0,128,255));

        final JButton MagentaButton = new JButton();
        MagentaButton.setBounds(450, 300, 150, 150);
        MagentaButton.setBackground(new Color(255,0,127));

        final JButton LPinkButton = new JButton();
        LPinkButton.setBounds(0, 450, 150, 150);
        LPinkButton.setBackground(new Color(255,204,204));

        final JButton BlackButton = new JButton();
        BlackButton.setBounds(150, 450, 150, 150);
        BlackButton.setBackground(new Color(0,0,0));

        final JButton DOrangeButton = new JButton();
        DOrangeButton.setBounds(300, 450, 150, 150);
        DOrangeButton.setBackground(new Color(209,127,5));

        final JButton DPurpleButton = new JButton();
        DPurpleButton.setBounds(450, 450, 150, 150);
        DPurpleButton.setBackground(new Color(51,0,102));



        frame.add(GreenButton);
        frame.add(RedButton);
        frame.add(DBlueButton);
        frame.add(YellowButton);
        frame.add(OrangeButton);
        frame.add(PurpleButton);
        frame.add(PinkButton);
        frame.add(GreyButton);
        frame.add(LGreenButton);
        frame.add(BBlueButton);
        frame.add(BlueButton);
        frame.add(MagentaButton);
        frame.add(LPinkButton);
        frame.add(BlackButton);
        frame.add(DOrangeButton);
        frame.add(DPurpleButton);
        
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

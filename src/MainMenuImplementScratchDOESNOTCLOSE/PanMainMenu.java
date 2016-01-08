package MainMenuImplementScratchDOESNOTCLOSE;

// this program will have a second button to change the background colour.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanMainMenu extends JPanel {

    JButton btn2x2;
    JButton btn3x3;
    JButton btn4x4;
    JButton btnExit;
    public GameTypeListener gameTypeListener;
    public PanMainMenu() { //http://stackoverflow.com/questions/5732058/best-swing-layout-for-2-dimensional-grid-of-buttons
        System.out.println("PanMainMenu");
        ExitListener exitListener = new ExitListener();
        gameTypeListener = new GameTypeListener();
        setBackground(Color.black);

        btn2x2 = new JButton("2 X 2");
        btn2x2.setForeground(new Color(255, 0, 0));
        btn2x2.setBounds(100, 100, 200, 200);
        btn3x3 = new JButton("3 X 3");
        btn3x3.setForeground(new Color(0, 0, 204));
        btn4x4 = new JButton("4 X 4");
        btn4x4.setForeground(new Color(76, 0, 153));
        btnExit = new JButton("EXIT");

        btn2x2.addActionListener(gameTypeListener);
        btn3x3.addActionListener(gameTypeListener);
        btn4x4.addActionListener(gameTypeListener);
        btnExit.addActionListener(exitListener);

        JPanel buttonPanel = new JPanel();
        JPanel containerPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.add(btn2x2);
        buttonPanel.add(btn3x3);
        buttonPanel.add(btn4x4);
        buttonPanel.add(btnExit);

        buttonPanel.setPreferredSize(new Dimension(600, 600));
        containerPanel.add(buttonPanel);
        add(containerPanel);
    }

    class ExitListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    class GameTypeListener implements ActionListener {
public PanEasy panEasy;
        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            if (btn.getText().equals("2 X 2")) {
                panEasy = new PanEasy();
                Window w = SwingUtilities.getWindowAncestor(PanMainMenu.this); //http://stackoverflow.com/questions/10936306/programmatically-close-a-jpanel-which-is-displayed-in-jdialog
                w.setVisible(false);  
            } else if (btn.getText().equals("3 X 3")) {
                setBackground(new Color(0, 0, 204));
            } else if (btn.getText().equals("4 X 4")) {
                setBackground(new Color(76, 0, 153));
            }
            panEasy.buttonFlash();
        }
    }
}
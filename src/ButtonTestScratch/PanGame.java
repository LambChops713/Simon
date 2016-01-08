package ButtonTestScratch;

// this program will have a second button to change the background colour.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanGame extends JPanel {

    JButton btn2x2;
    JButton btn3x3;
    JButton btn4x4;
    JButton btnExit;

    public PanGame() { //http://stackoverflow.com/questions/5732058/best-swing-layout-for-2-dimensional-grid-of-buttons
        ExitListener exitListener = new ExitListener();
        ColourListener colourListener = new ColourListener();

        btn2x2 = new JButton("2 X 2");
        btn2x2.setForeground(new Color(255, 0, 0));
        btn3x3 = new JButton("3 X 3");
        btn3x3.setForeground(new Color(0, 0, 204));
        btn4x4 = new JButton("4 X 4");
        btn4x4.setForeground(new Color(76, 0, 153));
        btnExit = new JButton("EXIT");

        btn2x2.addActionListener(colourListener);
        btn3x3.addActionListener(colourListener);
        btn4x4.addActionListener(colourListener);
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

    class ColourListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JButton btn = (JButton) event.getSource();
            if (btn.getText().equals("2 X 2")) {
                setBackground(new Color(255, 0, 0));
            } else if (btn.getText().equals("3 X 3")) {
                setBackground(new Color(0, 0, 204));
            } else if (btn.getText().equals("4 X 4")) {
                setBackground(new Color(76, 0, 153));
            }
        }
    }
}
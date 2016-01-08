package ButtonTestScratch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanTitle extends JPanel {

    ImageIcon imgHeader;
    JLabel lblHeader;

    public PanTitle() {
        lblHeader = new JLabel();
        imgHeader = new ImageIcon("Simon Logo.jpg");
        lblHeader.setIcon(imgHeader);
        lblHeader.setPreferredSize(new Dimension(550, 150));
        add(lblHeader);
    }
}
package MainMenuImplementScratchDOESNOTCLOSE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanTitle extends JPanel {

    ImageIcon imgHeader;
    JLabel lblHeader;

    public PanTitle() {
         System.out.println("PanTitle");
        setBackground(Color.black);
        lblHeader = new JLabel();
        imgHeader = new ImageIcon("Simon Logo.jpg");
        lblHeader.setIcon(imgHeader);
        lblHeader.setPreferredSize(new Dimension(500, 141));
        add(lblHeader);
    }
}
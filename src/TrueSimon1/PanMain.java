package TrueSimon1;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    public PanMain() {
        PanMainMenu panMainMenu = new PanMainMenu();
        PanTitle panTitle = new PanTitle();
        System.out.println("PanMain");
        setLayout(new BorderLayout());
        add(panMainMenu, BorderLayout.CENTER);
        add(panTitle, BorderLayout.NORTH);
    }
}
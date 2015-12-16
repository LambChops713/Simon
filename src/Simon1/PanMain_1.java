package simon;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanProgressBar panProgressBar = new PanProgressBar();
    PanGame panGame = new PanGame();
    PanTitle panTitle = new PanTitle();

    public PanMain() {
        setLayout(new BorderLayout()); 
        add(panGame, BorderLayout.CENTER);
        add(panTitle, BorderLayout.NORTH);
        add(panProgressBar, BorderLayout.SOUTH);
    }
}
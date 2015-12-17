package ProgressBarScratch;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel // panel definition
{
    PanGame panGame = new PanGame();
    PanLabelChange panLabelChange = new PanLabelChange();

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panLabelChange, BorderLayout.SOUTH);
        add(panGame, BorderLayout.CENTER);       
    }
}
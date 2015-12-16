package Simon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanProgressBar extends JPanel 
{

    int nProgress;
    private JProgressBar progressBar;

    public PanProgressBar() {
        progressBar = new JProgressBar();

        setBackground(Color.cyan);
        nProgress = 0;
        progressBar = new JProgressBar(nProgress, 30); //https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html
        progressBar.setValue(0);
        progressBar.setMaximum(30);
        progressBar.setStringPainted(true);
        progressBar.setForeground(new Color(50, 0, 100));
        progressBar.setBackground(Color.white);
        progressBar.setVisible(true);

        add(progressBar);
    }
}

package ProgressBarScratch;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanLabelChange extends JPanel
{
    int nProgress;
    String sName;
    JProgressBar progressBar;
    public PanLabelChange() {
        setBackground(Color.cyan);
        nProgress = 0;
        JButton btn1 = new JButton("Press");
        progressBar = new JProgressBar(nProgress, 30); //https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html
        progressBar.setValue(0);
        progressBar.setStringPainted(true);   
        progressBar.setForeground(new Color(50,0,100));
        progressBar.setBackground(Color.white);
        progressBar.setVisible(true);
        add(btn1);
        add(progressBar);
        class LabelChangeListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                JButton btn = (JButton) event.getSource();            
                nProgress++;
                progressBar.setValue(nProgress);   
                add(progressBar);         
            }
        }
        ActionListener labelChangeListener = new LabelChangeListener();
        btn1.addActionListener(labelChangeListener);
    }
}
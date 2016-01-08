package MainMenuImplementScratchDOESNOTCLOSE;

import java.awt.Color;
import javax.swing.JFrame;

public class FraMain extends JFrame {
    //PanEasy panEasy;
    public PanMain panMain;
    FraMain() {
        System.out.println("FraMain");
        panMain = new PanMain();
        //panEasy = new PanEasy();
        setSize(700, 800); //1370, 730 for fullscreen for laptop
        setTitle("Simon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE
        add(panMain);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void buttonFlash(FraMain fraMain){
        
        //fraMain.panMain.panMainMenu.gameTypeListener.panEasy.buttonFlash();
}
}
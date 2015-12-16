package Simon;

import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();

        setSize(700, 700); //1370, 730 for fullscreen for laptop
        setTitle("Simon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//DO_NOTHING_ON_CLOSE

        add(panMain);
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
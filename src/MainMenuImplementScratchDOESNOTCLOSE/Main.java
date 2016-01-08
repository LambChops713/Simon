package MainMenuImplementScratchDOESNOTCLOSE;
//Expand the page after clicking the buttons
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Main");
        FraMain fraMain = new FraMain();
        //fraMain.buttonFlash(fraMain);
        String Pump = "CoolMusic.wav"; //George and David's code
        InputStream in = new FileInputStream("CoolMusic.wav");
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
package MainMenuScratch;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Main {

    public static void main(String[] args) throws IOException { 
        FraMain fraMain = new FraMain();
        System.out.println("Main");
        String Pump = "CoolMusic.wav"; //George and David's code
        InputStream in = new FileInputStream("CoolMusic.wav");
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}
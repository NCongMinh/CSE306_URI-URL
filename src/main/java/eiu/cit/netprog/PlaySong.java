package eiu.cit.netprog;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlaySong {
    public static void main(String[] args) throws InterruptedException {
        try {
            File f = new File(
                    "C:\\Users\\NoC4\\Downloads\\minhne\\minhdanghoc\\CSE306\\lab-URL_URI\\src\\main\\java\\eiu\\cit\\n"
                            + //
                            "etprog\\sample1.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(f);

            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            Thread.sleep(20000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

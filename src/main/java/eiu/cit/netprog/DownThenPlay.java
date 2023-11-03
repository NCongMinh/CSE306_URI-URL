package eiu.cit.netprog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class DownThenPlay {
    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(
                    "C:\\Users\\NoC4\\Downloads\\minhne\\minhdanghoc\\CSE306\\lab-URL_URI\\src\\main\\java\\eiu\\cit\\n"
                            + //
                            "etprog\\video_part3.wav");
            int c;
            while ((c = is.read()) != -1) {
                os.write(c);
            }

            os.close();
            File f = new File(
                    "C:\\Users\\NoC4\\Downloads\\minhne\\minhdanghoc\\CSE306\\lab-URL_URI\\src\\main\\java\\eiu\\cit\\n"
                            + //
                            "etprog\\video_part3.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(f);

            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            
            Thread.sleep(5000);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
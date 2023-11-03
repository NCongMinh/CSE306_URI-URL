package eiu.cit.netprog;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.Buffer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class DownAndPlay {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample10.wav");
            InputStream is = url.openStream();
            BufferedInputStream buff = new BufferedInputStream(is);
            AudioInputStream ais = AudioSystem.getAudioInputStream(buff);
            AudioFormat format = ais.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();
            byte[] buffer = new byte[BUFFER_SIZE];
            int count = 0;
            while ((count = ais.read(buffer)) != -1) {
                line.write(buffer, 0, count);
            }

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    private static final int BUFFER_SIZE = 4096;
}

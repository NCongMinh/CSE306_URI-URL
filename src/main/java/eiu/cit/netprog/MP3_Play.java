package eiu.cit.netprog;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3_Play {

    public static void main(String[] args) {
        URL url;

        try {
            url = new URL("http://ice10.outlaw.fm/KIEV2");
            InputStream is = url.openStream();
            InputStream in = new BufferedInputStream(is);
            Player mp3Player = new Player(in);
            mp3Player.play();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }
}
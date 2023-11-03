package eiu.cit.netprog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class DownSong {
    public static void main(String[] args) {
        try {
            URL url = new URL(args[0]);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(
                    "C:\\Users\\NoC4\\Downloads\\minhne\\minhdanghoc\\CSE306\\lab-URL_URI\\src\\main\\java\\eiu\\cit\\n"
                            + //
                            "etprog\\vid_part2.wav");
            int c;
            while ((c = is.read()) != -1) {
                os.write(c);
            }

            os.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

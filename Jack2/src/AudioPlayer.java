
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/* 1. Download JLayer: http://www.javazoom.net/javalayer/javalayer.html, and add jar to project 
 * 4. Create a front end with buttons to allow user to mix 2 songs. (JFrame, JPanel, JButton */

public class AudioPlayer {

	public static void main(String[] args) throws IOException, JavaLayerException {
		/* 2. Find a sound online */
		/* 3. Play it with one of the public methods below */
		playFromAFile("AllStar.mp3");
	}

	public static void playFromAFile(String fileName) throws FileNotFoundException, JavaLayerException {
		FileInputStream fis = new FileInputStream(fileName);
		playSong(fis);
	}

	public static void playFromTheInternet(String songAddress) throws IOException, JavaLayerException {
		URL songUrl = new URL(songAddress);
		playSong(songUrl.openStream());
	}

	private static void playSong(InputStream songStream) throws JavaLayerException {

		final Player playMp3 = new Player(songStream);

		Thread t = new Thread() {
			public void run() {
				try {
					playMp3.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch blocktt
					e.printStackTrace();
				}
			}
		};
		t.start();
	}

}



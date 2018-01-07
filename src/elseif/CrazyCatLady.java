//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String b=JOptionPane.showInputDialog(null, "How many cats do you have");
		// 2. Convert their answer into an integer
int d = parseint(b);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if (d>3) {
	JOptionPane.showMessageDialog(null, "You're a crazy cat lady");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else if (d<=3&&d>=1) {
	playVideo("https://www.youtube.com/watch?v=iRXJXaLV0n4");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
else if (d==0) {
	playVideo("https://www.youtube.com/watch?v=W_juM14WHNQ");
}
	}

	private static int parseint(String b) {
		// TODO Auto-generated method stub
		return Integer.parseInt(b);
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99)+1;
		// 2. Print out the random variable above
	System.out.println(random);
		// 11. do the following 10 times
		for (int t = 0; t < 10; t++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String answer = JOptionPane.showInputDialog(null, "I have a number from 1-100. Can you guess what it is?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int i = Integer.parseInt(answer);
			// 5. if the guess is correct
if (i==random) {
	JOptionPane.showMessageDialog(null, "You guessed correct!");
	System.exit(0);
}
				// 6. win
			// 7. if the guess is high
if (i>random) {
	JOptionPane.showMessageDialog(null, "Your guess is too high! Guess again.");
}
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
if (i<random) {
	JOptionPane.showMessageDialog(null, "Your guess is too low! Guess again.");
}
		}
		// 12. tell them they lose
JOptionPane.showMessageDialog(null, "You lose!");
System.exit(0);
	}

}



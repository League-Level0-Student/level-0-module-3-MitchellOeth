//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas = JOptionPane.showInputDialog(null, "Do you like bananas?");
		//2. if they say no, 
		if(bananas.equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
			System.exit(0);
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if(bananas.equals("yes")) {
		String hobbie = JOptionPane.showInputDialog(null, "What is your favorite hobbie?");
			JOptionPane.showMessageDialog(null, hobbie + " is better with bananas.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
	
		}
			//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}

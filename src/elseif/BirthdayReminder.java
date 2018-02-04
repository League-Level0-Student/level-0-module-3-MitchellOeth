
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 12th";
		String dadsBirthday = "December 16th";
		String myBirthday = "February 28th";
		String sistersBirthday = "June 24";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog(null, "Which birthday would you like to know? Enter in mom, dad, sister, or me");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if(birthday.equals("mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(birthday.equals("dad")) {
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(birthday.equals("me")) {
			System.out.println(myBirthday);
		}
		else  if(birthday.equals("sister")) {
			System.out.println(sistersBirthday);
		}
			// print myBirthday
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

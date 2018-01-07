
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;
import java.util.Random;


public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
Robot shape = new Robot();
		//3. ask the user what color they would like the robot to draw
for (int i = 0; i < 1;) {
	

String answer = JOptionPane.showInputDialog(null, "What color would you like the robot to draw?");
		//4. use an if/else statement to set the pen color that the user requested

if (answer.equals("red")) {
	shape.setPenColor(900,0,0);
}
else if (answer.equals("blue")) {
	shape.setPenColor(0,0,900);
} 
else if (answer.equals("yellow")) {
	shape.setPenColor(Color.YELLOW);
} else {
	shape.setRandomPenColor();
}
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		shape.setPenWidth(10);
	    
//1. make the robot draw a shape (this will take more than one line of code)
shape.penDown();
shape.setSpeed(900);
for (int e = 0; e < 4; e++) {
	

shape.move(100);
shape.turn(90);
}
}
	}
}

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint2 {
public static void main(String[] args) {
	Robot r2d2 = new Robot();
	r2d2.penDown();
	r2d2.setSpeed(10);
	String color = JOptionPane.showInputDialog("What color do you want to draw the trangle?");
	if(color.equals("red")) {
		r2d2.setPenColor(Color.RED);
	}else if (color.equals("blue")) {
		r2d2.setPenColor(Color.BLUE);
	}else {
		r2d2.setRandomPenColor();
	}
	
	for (int i = 0; i < 3; i++) {
		
	
	r2d2.move(150);
	r2d2.turn(120);
	}
	}
}


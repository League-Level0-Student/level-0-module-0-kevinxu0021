import org.jointheleague.graphical.robot.Robot;

public class NameDrawing {
public static void main(String[] args) {
	Robot bender = new Robot();
	bender.setSpeed(10);
	bender.penDown();
	bender.move(200);
	bender.penUp();
	bender.turn(180);
	bender.move(100);
	bender.turn(230);
	bender.penDown();
	bender.move(150);
	bender.penUp();
	bender.turn(180);
	bender.move(150);
	bender.turn(260);
	bender.penDown();
	bender.move(150);
	bender.penUp();
	bender.move(100);
}
}

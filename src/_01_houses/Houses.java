package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot("mini");

	public void run() {
robot.setX(25);
robot.setY(500);
for (int i = 0; i < 10; i++) {
	building();
}

	}
	public void building() {
		
		robot.setSpeed(100);
		robot.penDown();
		robot.move(100);
		robot.turn(90);
		robot.move(25);
		robot.turn(90);
		robot.move(100);
		robot.turn(-90);
		robot.setPenColor(0,255,0);
		robot.move(20);
		robot.turn(-90);
		robot.setPenColor(0,0,0);
		
	}
	
	}


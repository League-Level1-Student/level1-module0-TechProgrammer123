package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot("mini");

	public void run() {
robot.setX(25);
robot.setY(500);

for (int i = 0; i < 2; i++) {
	building(20);
	building(40);
	building(80);
	building(30);
	building(90);
	building(10);
	building(50);
	building(70);
	building(10);
}

	}
	public void building(String height) {
		int Height = 120;
		if (height.equals("small")) {
			
		}
		robot.setSpeed(100);
		robot.penDown();
		robot.move(height);
		robot.turn(90);
		robot.move(25);
		robot.turn(90);
		robot.move(height);
		robot.turn(-90);
		robot.setPenColor(0,255,0);
		robot.move(20);
		robot.turn(-90);
		robot.setPenColor(0,0,0);
		
	}
	
	
	}


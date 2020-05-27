package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot robot = new Robot("mini");

	public void run() {
robot.setX(25);
robot.setY(500);

for (int i = 0; i < 3; i++) {
	drawPointyRoof("small");
	building("large");
	drawPointyRoof("medium");
	

}

	}
	public void building(String height) {
		int Height = 120;
	
		if (height.equals("large")) {
			Height = 250;
		}
		robot.setSpeed(100);
		robot.penDown();
		robot.move(Height);
		robot.turn(90);
		robot.move(25);
		robot.turn(90);
		robot.move(Height);
		robot.turn(-90);
		robot.setPenColor(0,255,0);
		robot.move(20);
		robot.turn(-90);
		robot.setPenColor(0,0,0);
		
	}
	public void drawPointyRoof (String height) {
		int Height = 120;
		if (height.equals("small")) {
			Height = 60;
		}
		else if (height.equals("medium")) {
			Height = 120;
		}
		robot.setSpeed(100);
		robot.penDown();
		robot.move(Height);
		robot.turn(90);
		robot.move(25);
		//pointy roof starts here
		robot.turn(-120);
		robot.move(25);
		robot.turn(-120);
		robot.move(25);
		robot.turn(-120);
		robot.move(25);
		//pointy roof ends here
		robot.turn(90);
		robot.move(Height);
		robot.turn(-90);
		robot.setPenColor(0,255,0);
		robot.move(20);
		robot.turn(-90);
		robot.setPenColor(0,0,0);
		
	
	}
	
	
	}


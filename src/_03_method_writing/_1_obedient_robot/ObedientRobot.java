package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot rob = new Robot();

	public static void main(String[] args) {
		
	}

	 void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.setSpeed(20);
			rob.move(100);
			rob.turn(90);
		}
	}

	void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			rob.setSpeed(20);
			rob.turn(300);
			rob.move(100);
		}
	}

	void drawCircle() {
		for (int i = 0; i < 4; i++) {
			rob.setSpeed(20);
			rob.move(100);
			rob.turn(90);
		}
	}
}

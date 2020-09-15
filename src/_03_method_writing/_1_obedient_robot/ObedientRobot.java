package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot rob = new Robot();

	public static void main(String[] args) {
		ObedientRobot rob = new ObedientRobot();
		String whichObject = JOptionPane.showInputDialog("What shape would you like to draw today?");
		if (whichObject.equals("square")) {
			rob.drawSquare();
		} else if (whichObject.equals("triangle")) {
			rob.drawTriangle();
		} else {
			rob.drawCircle();
		}
	}

	void drawSquare() {
		String color = JOptionPane.showInputDialog("Which color would you like to draw with?");
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.setSpeed(20);
			rob.move(100);
			rob.turn(90);
		}
	}

	void drawTriangle() {
		String color = JOptionPane.showInputDialog("Which color would you like to draw with?");
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		for (int i = 0; i < 3; i++) {
			rob.penDown();
			rob.setSpeed(20);
			rob.turn(-120);
			rob.move(100);
		}
	}

	void drawCircle() {
		String color = JOptionPane.showInputDialog("Which color would you like to draw with?");
		if (color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		if (color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		if (color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		for (int i = 0; i < 360; i++) {
			rob.penDown();
			rob.setSpeed(20);
			rob.move(1);
			rob.turn(1);
		}
	}
}

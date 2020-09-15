package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
//Use pop-ups for the following.
//Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesNumber = Integer.parseInt(dimes);
//Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + dimesNumber * 10 + " cents.");

//Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int heightNumber = Integer.parseInt(height);

//If they are shorter than 36 inches, tell them to eat their Wheaties
		if (heightNumber < 36) {
			JOptionPane.showMessageDialog(null, "Go eat your wheaties");
		}

	}

	void skill2() {// Write a loop to print every third number between 1 and 30 to the console

		for (int i = 1; i < 31; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

	void skill3() {// Get a random number that is less than 20 and print it to the console

		Random ran = new Random();
		int ranInt20 = ran.nextInt(20);
		System.out.println(ranInt20);
//Get another random number that is less than 10 and print it to the console 
		Random ran1 = new Random();
		int ranInt10 = ran1.nextInt(10);
		System.out.println(ranInt10);
//Using a pop-up, tell the user the difference between the numbers// Hint: use subtraction 
		JOptionPane.showMessageDialog(null,
				"The difference between " + ranInt20 + " and " + ranInt10 + " is " + (ranInt20 - ranInt10));

	}

	void skill4() {// In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");

//If they answered "San Diego", tell them they live in America's Finest City 
		if (city.equals("san diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		}

//Otherwise, tell them to move to San Diego 
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego!");
		}

//Create a variable - cars - and initialize it to the number of cars your family has.// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
		int cars = 2;
if (cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
if (cars == 1) {
	

//If there is 1 car, use a pop-up to display the make/model of the car 
JOptionPane.showMessageDialog(null, "Honda Civic");
}
//If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 
if (cars > 1) {
	JOptionPane.showMessageDialog(null, "There are a total of 8 wheels");
}
	}

void skill5() {// In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What school do you go to?");

//In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null,school+" is a fantastic school!");

}
}

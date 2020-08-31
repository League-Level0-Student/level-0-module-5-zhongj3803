package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean prime = true;
		String number = JOptionPane.showInputDialog("Please enter a number");
		int numberNumber = Integer.parseInt(number);
		for (int i = 2; i < numberNumber; i++) {
			if (numberNumber % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		} else {
			JOptionPane.showMessageDialog(null, "Your number is composite");
		}
	}
}

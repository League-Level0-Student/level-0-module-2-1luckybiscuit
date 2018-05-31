//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		for(int i = 0;i<10;i++) {
			int randomNumber = randomMaker.nextInt(5);
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Your IQ is higher than your weight (in kilograms)");
		}else if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "New face filters on Instagram today. \nThis is my favorite one so far. Nice job team!");
		}else if(randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Senator, that is a great question. \nWe are planning to make dabbing legal by 2020.");
		}else if(randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "For those who are reading this: You are very well educated!");
		}else{
			
		}
		// 4. Repeat all the code above 10 times
		}
		// 5. Find someone to test out your program. They will like it :)
	}
}

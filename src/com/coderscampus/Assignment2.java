package com.coderscampus;

import java.util.Scanner;
import java.util.Random;


public class Assignment2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		int randomNumber = random.nextInt(101);
		
		int userInput = 0;
		int userTries = 5;
		
		for (int i = 0; i < userTries; i++) {
		
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt();
			
			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again.");
			}
			
			if (guess < randomNumber) {
				System.out.println("Please pick a higher number.");
			}
			else if (guess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			else {
				System.out.println("You win!");
				scanner.close();
			}
			if (userTries == 0) {
				System.out.println("You lose. The numnber to guess was " + randomNumber);
			}
		scanner.close();
		}
	
	
	} 
	
}

	
	


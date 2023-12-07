package com.greatlearning.emailapp.services;

import java.util.Random;

public class PasswordGenerator {
	
	// Method to generate the Password with combination of Capital Letters/Small Letters/Numbers/Special Characters.
	public String generatePassword() {
		
		//Final Data Members Initialized with static values which will be used to generate the password.
		final String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String smallletters = "abcdefghijklmnopqrstuvwxyz";
		final String numbers = "0123456789";
		final String specialCharacters = "!@#$%&*<>/?";
		
		// combinedCharactersNumbers data member initialized with a  combination of capitalletters/smallletters/numbers/specialCharacters
		String combinedCharactersNumbers = capitalletters + smallletters + numbers + specialCharacters;
		
		// Declared length data member and initialized with combinedCharactersNumbers String length 
		int length = combinedCharactersNumbers.length();
		
		
		// StringBuilder object instantiated to concatenate multiple Strings.
		StringBuilder generatePassword = new StringBuilder();
	
		
		// For loop to generate the 8 characters password
		for (int i = 0; i < 8; i++) {
			
			//Random object instantiated and used its nextInt method to get random numbers within range of combinedstring data member.
			Random rand = new Random();
			int index = rand.nextInt(length);
			
			// StringBuilder methods used to append each random character to generatedPassword data member .
			generatePassword.append(combinedCharactersNumbers.charAt(index));
		
		}
		
		String generatedPassword = generatePassword.toString();
		
		return generatedPassword;
	
	}
}
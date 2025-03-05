package com.srihari.argon2main;

import java.util.Scanner;

import com.srihari.argon2hash.Argon2PasswordHasher;

public class Argon2HashingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Argon2PasswordHasher hasher = new Argon2PasswordHasher();

		// Get user input for password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
		// Hash the password
		String hashedPassword = hasher.hashPassword(password);
		System.out.println("Hashed password: " + hashedPassword);

		// Verify the password
		boolean isValid = hasher.verifyPassword(hashedPassword, password);
		System.out.println("Password verification result: " + isValid);

		// Verify with wrong password
		boolean isInvalid = hasher.verifyPassword(hashedPassword, "WrongPassword");
		System.out.println("Wrong password verification result: " + isInvalid);
		scanner.close();
	}

}

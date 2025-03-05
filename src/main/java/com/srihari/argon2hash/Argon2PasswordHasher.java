package com.srihari.argon2hash;


import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2PasswordHasher {
	// Constants for Argon2 configuration
    private static final int ITERATIONS = 10;
    private static final int MEMORY = 65536;
    private static final int PARALLELISM = 1;
    
    // Create an instance of Argon2 using the recommended variant (Argon2id)
    private final Argon2 argon2 = Argon2Factory.create(
        Argon2Factory.Argon2Types.ARGON2id,
        32,    // Salt length
        64     // Hash length
    );

    /**
     * Hash a password using Argon2
     * 
     * @param password The password to hash
     * @return The hashed password
     */
    public String hashPassword(String password) {
        try {
            // Convert password to char array for secure handling
            char[] passwordChars = password.toCharArray();
            
            // Generate the hash
            String hash = argon2.hash(
                ITERATIONS,
                MEMORY,
                PARALLELISM,
                passwordChars
            );
            
            return hash;
        } catch (Exception e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    /**
     * Verify a password against a hash
     * 
     * @param hash The stored hash
     * @param password The password to verify
     * @return true if the password matches, false otherwise
     */
    public boolean verifyPassword(String hash, String password) {
        try {
            // Convert password to char array
            char[] passwordChars = password.toCharArray();
            
            // Verify the password against the hash
            return argon2.verify(hash, passwordChars);
        } catch (Exception e) {
            throw new RuntimeException("Error verifying password", e);
        }
    }
}

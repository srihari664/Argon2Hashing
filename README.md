Argon2 Password Hashing
🔒 What is Argon2?
Argon2 is a modern and secure password hashing algorithm that won the Password Hashing Competition (PHC) in 2015. It is designed to be resistant to brute-force attacks and offers configurable memory, time, and parallelism parameters to enhance security.

⚡ Why Use Argon2?
Highly secure: Protects against brute-force attacks and GPU/ASIC cracking.
Configurable: Allows tuning of memory usage, processing time, and CPU parallelism.
Resistant to side-channel attacks: Prevents timing and cache-based attacks.
Recommended for password hashing: Used in security-sensitive applications.
🚀 How Argon2 Works
Argon2 operates by:

Filling memory blocks with pseudo-random values derived from the password and salt.
Applying multiple passes of memory-intensive computations.
Using parallel processing to make brute-force attacks more difficult.
Generating a secure hash that is difficult to reverse.
🔑 Types of Argon2
Argon2 comes in three variations:

Argon2i - Resistant to side-channel attacks, recommended for password hashing.
Argon2d - Provides strong protection against GPU-based attacks.
Argon2id (Recommended) - A hybrid of Argon2i and Argon2d, balancing security and performance.

| Sample Output |
| --- |
| Enter your password: my_secure_password
Hashed password: $argon2id$v=19$m=65536,t=10,p=1$...
Password verification result: true
Wrong password verification result: false| 

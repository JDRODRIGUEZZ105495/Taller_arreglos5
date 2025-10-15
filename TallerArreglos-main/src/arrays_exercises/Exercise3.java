package arrays_exercises;

import javax.swing.JOptionPane;

public class Exercise3 {
    public static void execute() {
        int[] primeNumbers = new int[10];
        int count = 0;
        int number = 100; // Start from 100
        
        // Find first 10 prime numbers between 100 and 300
        while (count < 10 && number <= 300) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        
        // Display the result
        StringBuilder result = new StringBuilder("Los 10 primeros números primos entre 100 y 300 son:\n");
        for (int i = 0; i < count; i++) {
            result.append((i + 1)).append(". ").append(primeNumbers[i]).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, result.toString());
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

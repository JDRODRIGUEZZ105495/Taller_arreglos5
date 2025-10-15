package arrays_exercises;

import utils.Utility;
import javax.swing.JOptionPane;

public class Exercise2 {
    public static void execute() {
        int size = 10; // We need exactly 10 numbers
        int[] numbers = new int[size];
        
        // Read 10 integers
        for (int i = 0; i < size; i++) {
            numbers[i] = Utility.readInteger("Ingrese el número " + (i + 1) + ":");
        }
        
        int maxPrime = Integer.MIN_VALUE;
        int position = -1;
        
        // Find the largest prime number and its position
        for (int i = 0; i < size; i++) {
            if (isPrime(numbers[i]) && numbers[i] > maxPrime) {
                maxPrime = numbers[i];
                position = i;
            }
        }
        
        // Display the result
        if (position != -1) {
            JOptionPane.showMessageDialog(null, 
                "El mayor número primo es: " + maxPrime + 
                "\nSe encuentra en la posición: " + (position + 1));
        } else {
            JOptionPane.showMessageDialog(null, 
                "No se encontraron números primos en el arreglo.");
        }
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

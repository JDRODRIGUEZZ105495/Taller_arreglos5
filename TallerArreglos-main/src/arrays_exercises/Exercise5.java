package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise5 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        // Read 10 integers and find the maximum
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Utility.readInteger("Ingrese el número " + (i + 1) + ":");
            
            if (numbers[i] > max) {
                max = numbers[i];
                count = 1;  // Reset count when a new maximum is found
            } else if (numbers[i] == max) {
                count++;    // Increment count when the current maximum is found again
            }
        }
        
        String message = "El número mayor es: " + max + "\n";
        message += "Se repite " + count + " vez(es) en el arreglo.";
        
        JOptionPane.showMessageDialog(null, message);
    }
}

package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise6 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int sum = 0;
        
        // Read 10 integers
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Utility.readInteger("Ingrese el número " + (i + 1) + ":");
            sum += numbers[i];
        }
        
        // Calculate integer average
        int average = sum / SIZE;
        boolean found = false;
        
        // Check if average exists in the array
        for (int number : numbers) {
            if (number == average) {
                found = true;
                break;
            }
        }
        
        // Show result
        String message = "El promedio entero es: " + average + "\n";
        message += found 
            ? "El promedio SÍ se encuentra en el arreglo."
            : "El promedio NO se encuentra en el arreglo.";
            
        JOptionPane.showMessageDialog(null, message);
    }
}

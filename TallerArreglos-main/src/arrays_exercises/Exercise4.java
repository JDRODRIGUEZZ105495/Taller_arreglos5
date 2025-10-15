package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise4 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        StringBuilder result = new StringBuilder("Números terminados en 4 se encuentran en las posiciones:\n");
        boolean found = false;
        
        // Read 10 integers
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Utility.readInteger("Ingrese el número " + (i + 1) + ":");
            
            // Check if the number ends with 4
            if (Math.abs(numbers[i] % 10) == 4) {
                result.append("Posición ").append(i).append(" (Valor: ").append(numbers[i]).append(")\n");
                found = true;
            }
        }
        
        if (!found) {
            result.append("No se encontraron números terminados en 4.");
        }
        
        JOptionPane.showMessageDialog(null, result.toString());
    }
}

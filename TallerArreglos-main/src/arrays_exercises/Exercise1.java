package arrays_exercises;

import utils.Utility;
import javax.swing.JOptionPane;

public class Exercise1 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        
        // Read 10 integers from the user
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = Utility.readInteger("Ingrese el número " + (i + 1) + ":");
        }
        
        // Find the position of the largest number
        int maxPosition = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxPosition]) {
                maxPosition = i;
            }
        }
        
        // Display the result (adding 1 to convert from 0-based to 1-based index for user)
        JOptionPane.showMessageDialog(null, 
            "El número más grande es " + numbers[maxPosition] + 
            " y se encuentra en la posición " + (maxPosition + 1));
    }
}

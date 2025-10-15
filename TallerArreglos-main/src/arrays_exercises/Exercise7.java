package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise7 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = Utility.readIntegerArray("Ingrese número ", SIZE);
        
        int maxSum = -1;
        int position = -1;
        
        // Find the number with the maximum digit sum
        for (int i = 0; i < SIZE; i++) {
            int currentSum = sumOfDigits(numbers[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                position = i;
            }
        }
        
        // Display the result (adding 1 to position for 1-based indexing in output)
        String message = String.format(
            "El número con la mayor suma de dígitos es %d (suma: %d) y se encuentra en la posición %d",
            numbers[position], maxSum, position + 1
        );
        
        JOptionPane.showMessageDialog(null, message);
    }
    
    // Helper method to calculate the sum of digits of a number
    private static int sumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // Handle negative numbers
        
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
}

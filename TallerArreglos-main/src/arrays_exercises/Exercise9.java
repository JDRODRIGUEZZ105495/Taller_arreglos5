package arrays_exercises;

import utils.Utility;
import javax.swing.*;

public class Exercise9 {
    public static void execute() {
        final int SIZE = 10;
        int[] numbers = Utility.readIntegerArray("Ingrese número ", SIZE);
        
        StringBuilder result = new StringBuilder("Secuencias generadas:\n\n");
        
        // Generate sequences for each number
        for (int i = 0; i < SIZE; i++) {
            int currentNum = numbers[i];
            result.append("Para ").append(currentNum).append(": ");
            
            if (currentNum > 0) {
                // For positive numbers, show 1 to n
                for (int j = 1; j <= currentNum; j++) {
                    result.append(j);
                    if (j < currentNum) {
                        result.append(", ");
                    }
                }
            } else if (currentNum < 0) {
                // For negative numbers, show 1, 0, -1, -2, ... down to n
                for (int j = 1; j >= currentNum; j--) {
                    result.append(j);
                    if (j > currentNum) {
                        result.append(", ");
                    }
                }
            } else {
                // For zero, just show 1, 0
                result.append("1, 0");
            }
            
            result.append("\n\n");
        }
        
        // Display the result in a scrollable text area if it's too long
        JTextArea textArea = new JTextArea(result.toString(), 15, 30);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Secuencias generadas", JOptionPane.INFORMATION_MESSAGE);
    }
}

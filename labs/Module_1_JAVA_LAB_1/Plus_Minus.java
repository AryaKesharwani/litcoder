
import java.util.Scanner;
// change class to Main
public class Plus_Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the number of elements (although not necessary for array operations, may be part of input format)
        int n = scanner.nextInt();
        
        // Array to store the numbers
        int[] array = new int[n];
        
        // Reading the elements into the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Variables to count positives, negatives, and zeros
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        
        // Count each type of element
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        // Calculate and print the fractions with three decimal places
        System.out.printf("%.3f\n", positiveCount / (double) n);
        System.out.printf("%.3f\n", negativeCount / (double) n);
        System.out.printf("%.3f\n", zeroCount / (double) n);
        
        // Close the scanner
        scanner.close();
    }
}
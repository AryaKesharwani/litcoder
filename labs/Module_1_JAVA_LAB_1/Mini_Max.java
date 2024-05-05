
import java.util.Scanner;
// change class to Main
public class Mini_Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store the six input numbers
        int[] numbers = new int[6];
        
        // Read six integers from user input
        // System.out.println("Enter six positive integers:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Function to calculate and print minimum and maximum sums of combinations
        printMinAndMaxSums(numbers);
        
        // Close the scanner
        scanner.close();
    }

    private static void printMinAndMaxSums(int[] numbers) {
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        // Generate all combinations of four out of six numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    for (int l = k + 1; l < numbers.length; l++) {
                        int sum = numbers[i] + numbers[j] + numbers[k] + numbers[l];
                        if (sum < minSum) {
                            minSum = sum;
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }
        }

        // Print the results
        System.out.println(minSum + " "+ maxSum);
        // System.out.println("Maximum sum: " + maxSum);
    }
}
                                                                                                                            
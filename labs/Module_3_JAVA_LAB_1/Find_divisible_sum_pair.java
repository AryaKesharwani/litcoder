import java.util.Scanner;
// change the class name to Main
public class Find_divisible_sum_pair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read the divisor from the first line of input
            // System.out.print("Enter the divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            
            // Read the array elements from the second line of input
            // System.out.print("Enter the array elements separated by spaces: ");
            String[] inputNumbers = scanner.nextLine().split(" ");
            int[] array = new int[inputNumbers.length];
            
            for (int i = 0; i < inputNumbers.length; i++) {
                array[i] = Integer.parseInt(inputNumbers[i]);
            }
            
            // Calculate and output the number of divisible pairs
            System.out.println(countDivisiblePairs(divisor, array));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure all entries are integers.");
        } finally {
            scanner.close();
        }
    }

    // Method to count pairs whose sum is divisible by a given divisor
    private static int countDivisiblePairs(int divisor, int[] array) {
        int count = 0;
        // Iterate over each pair in the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) % divisor == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
                                                                                                                            
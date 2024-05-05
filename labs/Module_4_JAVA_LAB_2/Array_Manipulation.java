import java.util.Scanner;

public class Array_Manipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user for the size of the array
        // System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Take input for the number of queries
        // System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();

        // Initialize the array with size n+1 (1-indexed)
        int[] arr = new int[n + 1];
        int maxVal = 0;

        // Process each query
        for (int i = 0; i < q; i++) {
            // System.out.print("Enter the query (a b val): ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int val = scanner.nextInt();

            // Apply the operation and update the maximum value
            for (int j = a; j <= b; j++) {
                arr[j] += val;
                if (arr[j] > maxVal) {
                    maxVal = arr[j];  // Update maxVal if the current index has a higher value
                }
            }
        }

        // Output the maximum value in the array
        System.out.println(maxVal);

        scanner.close();
    }
}
                                                                                                                            
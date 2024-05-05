import java.util.ArrayList;
import java.util.Scanner;
// change the class name to Main
public class Gringotts_Bank_Puzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Reading the input line and splitting by space
        String line = scanner.nextLine();
        String[] inputs = line.split("\\s+");
        
        // Parsing integers and adding to the list
        for (String input : inputs) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Array should only contain positive values");
                scanner.close();
                return;  // Exit if there is a negative number
            }
            arr.add(num);
        }

        // Perform the operations until only one element remains
        while (arr.size() > 1) {
            arr.add(0, arr.remove(arr.size() - 1)); // Rotate by moving the last element to the front
            arr.remove(arr.size() - 1);  // Remove the last element
        }

        // Output the last remaining element
        if (!arr.isEmpty()) {
            System.out.println(arr.get(0));
        }

        scanner.close();
    }
}
                                                                                                                            
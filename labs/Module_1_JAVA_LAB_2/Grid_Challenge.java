
import java.util.*;
// change the class name to Main
public class Grid_Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the input data:");
        String inputData = scanner.nextLine();
        System.out.println(isSortedGrid(inputData));
        scanner.close();
    }

    public static String isSortedGrid(String input) {
        // Split the input string to get parts
        String[] parts = input.split(",");
        int grid_size = Integer.parseInt(parts[1].split(" ")[1]);
        String[] grid_data = Arrays.copyOfRange(parts, 2, parts.length);
        
        // Sort each row
        char[][] sortedRows = new char[grid_size][grid_size];
        for (int i = 0; i < grid_size; i++) {
            char[] row = grid_data[i].toCharArray();
            Arrays.sort(row);
            sortedRows[i] = row;
        }
        
        // Check if columns are sorted
        for (int col = 0; col < grid_size; col++) {
            for (int row = 1; row < grid_size; row++) {
                if (sortedRows[row][col] < sortedRows[row - 1][col]) {
                    return "NO";
                }
            }
        }
        
        return "YES";
    }
}
                                                                                                                            

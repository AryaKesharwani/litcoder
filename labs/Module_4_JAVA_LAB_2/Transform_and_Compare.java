import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// change the class name to Main
public class Transform_and_Compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user for the start and end strings
        // System.out.print("Enter the starting string: ");
        String start = scanner.nextLine();
        // System.out.print("Enter the ending string: ");
        String end = scanner.nextLine();

        // Call the transformation check function
        boolean result = canTransform(start, end);
        System.out.println(result);

        scanner.close();
    }

    public static boolean canTransform(String start, String end) {
        if (start.length() != end.length()) {
            return false;
        }

        int n = start.length();
        List<IndexCharPair> startIndices = new ArrayList<>();
        List<IndexCharPair> endIndices = new ArrayList<>();

        // Filter out 'X' and collect indices and characters where char is 'L' or 'R'
        for (int i = 0; i < n; i++) {
            char sChar = start.charAt(i);
            char eChar = end.charAt(i);
            if (sChar != 'X') {
                startIndices.add(new IndexCharPair(i, sChar));
            }
            if (eChar != 'X') {
                endIndices.add(new IndexCharPair(i, eChar));
            }
        }

        // If lengths of the filtered lists don't match
        if (startIndices.size() != endIndices.size()) {
            return false;
        }

        // Check for each pair if transformation is possible
        for (int i = 0; i < startIndices.size(); i++) {
            IndexCharPair startPair = startIndices.get(i);
            IndexCharPair endPair = endIndices.get(i);
            if (startPair.character != endPair.character) {
                return false;
            } else if (startPair.character == 'L' && startPair.index < endPair.index) {
                return false;
            } else if (startPair.character == 'R' && startPair.index > endPair.index) {
                return false;
            }
        }

        return true;
    }

    // Helper class to store index and character
    private static class IndexCharPair {
        int index;
        char character;

        IndexCharPair(int index, char character) {
            this.index = index;
            this.character = character;
        }
    }
}
                                                                                                                            
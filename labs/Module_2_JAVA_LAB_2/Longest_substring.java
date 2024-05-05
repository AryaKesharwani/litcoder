import java.util.HashMap;
import java.util.Scanner;
// change the class name to Main
public class Longest_substring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Longest_substring solution = new Longest_substring();
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the string to check for the longest substring without repeating characters:");
        String inputString = scanner.nextLine();
        int result = solution.lengthOfLongestSubstring(inputString);
        // System.out.println("Length of the longest substring without repeating characters: " + result);
        System.out.println(result);
        scanner.close();
    }
}

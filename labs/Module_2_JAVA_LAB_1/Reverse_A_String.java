import java.util.Scanner;
// change the class name to Main
public class Reverse_A_String {
    public static String reversePreserve(String text) {
        StringBuilder letters = new StringBuilder();
        // Collect all alphabetic characters
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }
        
        // Reverse the collected characters
        letters.reverse();
        
        // Reintegrate characters
        StringBuilder result = new StringBuilder();
        int letterIndex = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.charAt(letterIndex++));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        // System.out.println("Enter a string to be reversed, preserving punctuation and spaces:");
        String userInput = scanner.nextLine();
        
        // Process the input and display the output
        String output = reversePreserve(userInput);
        // System.out.println("Reversed string: " + output);
        System.out.println(output);
        
        scanner.close();
    }
}
                                                                                                                            
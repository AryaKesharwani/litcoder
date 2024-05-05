import java.util.Scanner;

public class Pin_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        StringBuilder pin = new StringBuilder();
        for (String number : numbers) {
            int sum = 0;
            // Sum all digits in the number
            for (char digit : number.toCharArray()) {
                sum += digit - '0';
            }
            // Reduce to a single digit
            int singleDigit = reduceToSingleDigit(sum);
            // Convert to character or leave as digit based on even or odd
            char pinChar = convertToPINCharacter(singleDigit);
            pin.append(pinChar);
        }
        System.out.println( pin.toString());
        scanner.close();
    }

    // Helper method to reduce any number to a single digit
    private static int reduceToSingleDigit(int number) {
        while (number > 9) {
            int newSum = 0;
            while (number > 0) {
                newSum += number % 10;
                number /= 10;
            }
            number = newSum;
        }
        return number;
    }

    // Helper method to convert a single digit to its corresponding PIN character
    private static char convertToPINCharacter(int digit) {
        if (digit % 2 != 0) { // If it's odd
            // 'a' is 97 in ASCII, and '1' is mapped to 'a' which is 97 - 1
            return (char) ('a' + digit - 1);
        } else {
            return (char) ('0' + digit); // For even numbers, just return the digit itself
        }
    }
}
                                                                                                                            
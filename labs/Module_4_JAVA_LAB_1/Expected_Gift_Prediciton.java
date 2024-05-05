import java.util.Arrays;
import java.util.Scanner;

class Expected_Gift_Prediciton {
    public static String calculateGifts(int[] scores) {
        int n = scores.length;
        int[] gifts = new int[n]; // Initialize all team members with 1 gift
        Arrays.fill(gifts, 1);

        for (int i = 0; i < n; i++) {
            int currentScore = scores[i];
            int prevScore = (i == 0) ? 0 : scores[i - 1];

            // Compare with previous team member
            if (currentScore > prevScore) {
                gifts[i] = (i == 0) ? 1 : gifts[i - 1] + 1; // Add one gift

                // Check for divisibility by 3 or 5
                if (currentScore % 3 == 0) {
                    gifts[i] += 3;
                }
                if (currentScore % 5 == 0) {
                    gifts[i] += 5;
                }
            } else if (currentScore == prevScore) {
                gifts[i] = (i == 0) ? 1 : gifts[i - 1] + 1; // Add one gift
            }

            // Check for divisibility by 7 (lucky draw)
            if (currentScore % 7 == 0) {
                gifts[i] = findMax(gifts) + 1;
            }

            // Check if adjacent team members have the same number of gifts
            if (i > 0 && gifts[i] == gifts[i - 1]) {
                return "Should not receive the same number of gifts";
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int gift : gifts) {
            sb.append(gift).append(" ");
        }
        return sb.toString().trim();
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] scores = new int[inputArray.length];

        // Check if all inputs are integers
        boolean isValidInput = true;
        for (int i = 0; i < inputArray.length; i++) {
            try {
                scores[i] = Integer.parseInt(inputArray[i]);
            } catch (NumberFormatException e) {
                isValidInput = false;
                break;
            }
        }

        if (isValidInput) {
            String gifts = calculateGifts(scores);
            System.out.println(gifts);
        } else {
            System.out.println("Invalid input");
        }
    }
}

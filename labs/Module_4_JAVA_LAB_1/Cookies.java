import java.util.PriorityQueue;
import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the target sweetness
        int targetSweetness = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Read the sweetness of each candy
        PriorityQueue<Integer> candyQueue = new PriorityQueue<>();
        String[] candies = scanner.nextLine().split(" ");
        for (String candy : candies) {
            candyQueue.add(Integer.parseInt(candy));
        }

        int steps = 0;

        // Combine candies until the smallest candy in the queue meets or exceeds the target sweetness
        while (candyQueue.size() > 1 && (candyQueue.peek() < targetSweetness)) {
            int leastSweet = candyQueue.poll();
            int secondLeastSweet = candyQueue.poll();

            // Calculate the new candy sweetness
            int newCandy = leastSweet + 2 * secondLeastSweet;
            candyQueue.add(newCandy);
            steps++;
        }

        // Check if we have reached or exceeded the target sweetness with the available candies
        if (candyQueue.peek() >= targetSweetness) {
            System.out.println(steps);
        } else {
            System.out.println("It is not possible to reach or exceed the target sweetness with the given candies.");
        }

        scanner.close();
    }
}
                                                                                                                            
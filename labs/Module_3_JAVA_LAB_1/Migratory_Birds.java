import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// change the class name to Main
public class Migratory_Birds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter plant sightings separated by spaces:");

        // Read the entire line of plant IDs as a single string
        String line = scanner.nextLine();
        String[] plantStrings = line.split(" ");
        int[] plants = new int[plantStrings.length];

        // Convert string inputs into integers
        for (int i = 0; i < plantStrings.length; i++) {
            plants[i] = Integer.parseInt(plantStrings[i]);
        }

        // Determine the most common plant ID
        int mostCommonPlant = findMostCommonPlant(plants);
        System.out.println(mostCommonPlant);

        scanner.close();
    }

    private static int findMostCommonPlant(int[] plants) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mostCommonPlantId = -1;

        // Count each plant sighting
        for (int plant : plants) {
            countMap.put(plant, countMap.getOrDefault(plant, 0) + 1);
            int currentCount = countMap.get(plant);

            // Check if the current plant ID should be the new most common
            if (currentCount > maxCount || (currentCount == maxCount && plant < mostCommonPlantId)) {
                maxCount = currentCount;
                mostCommonPlantId = plant;
            }
        }

        return mostCommonPlantId;
    }
}
                                                                                                                            
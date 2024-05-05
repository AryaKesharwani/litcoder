import java.util.Scanner;
// change the class name to Main
public class Time_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter time in 12-hour AM/PM format (e.g., 07:45:54PM):");
        String time12 = scanner.nextLine();
        String time24 = convertToMilitary(time12);
        // System.out.println("Converted time in 24-hour format: " + time24);
        System.out.println(time24);
        scanner.close();
    }

    public static String convertToMilitary(String time12) {
        // Extract the AM/PM part
        String period = time12.substring(time12.length() - 2);
        
        // Extract hours, minutes, and seconds
        int hours = Integer.parseInt(time12.substring(0, 2));
        String minutes = time12.substring(3, 5);
        String seconds = time12.substring(6, 8);
        
        // Convert based on AM/PM
        if (period.equals("AM")) {
            if (hours == 12) {
                hours = 0;  // Midnight case
            }
        } else {  // PM case
            if (hours != 12) {
                hours += 12;  // Convert PM hour to 24-hour format
            }
        }
        
        // Format the hour to ensure two digits
        String hourFormatted = String.format("%02d", hours);
        
        // Create the 24-hour format time string
        return hourFormatted + ":" + minutes + ":" + seconds;
    }
}

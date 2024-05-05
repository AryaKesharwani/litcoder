import java.util.Arrays;
import java.util.Scanner;

class Triple_Modular_lucky_array {
    public static int tripleModularExponentiation(int[] arr) {
        int mod = 9;
        int result = 1;
        for (int num : arr) {
            result = (((result * num) % mod) * (int) Math.pow(result, mod)) % mod;
        }
        return result;
    }

    public static String findLuckyArray(int[] arr) {
        int n = arr.length;
        if (n < 4) {
            return "Invalid Input";
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int maxModulus = 0;
        int[] luckyArray = new int[4];

        for (int i = 0; i <= n - 4; i++) {
            int[] subarray = Arrays.copyOfRange(arr, i, i + 4);
            int modulus = tripleModularExponentiation(subarray);
            if (modulus > maxModulus) {
                maxModulus = modulus;
                luckyArray = subarray;
            }
        }

        if (maxModulus == 0) {
            return "There is no lucky array in the list of subarrays";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < luckyArray.length; i++) {
                sb.append(luckyArray[i]);
                if (i != luckyArray.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("] ");
            sb.append(maxModulus);
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.println(findLuckyArray(arr));
    }
}
                                                                                                                            
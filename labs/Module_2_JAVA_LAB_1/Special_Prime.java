import java.util.*;
// change the class name to Main
public class Special_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(findLargestSpecialPrime(n));
        // System.out.println("The largest special prime less than " + n + " is: " + findLargestSpecialPrime(n));
    }

    private static int findLargestSpecialPrime(int n) {
        int largestSpecialPrime = -1;
        boolean[] isPrime = sieveOfEratosthenes(n);  // Sieve limit set to input n, might adjust as needed

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                if (isSpecialPrime(i, isPrime)) {
                    largestSpecialPrime = i;
                }
            }
        }

        return largestSpecialPrime;
    }

    private static boolean[] sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple < limit; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        return isPrime;
    }

    private static boolean isSpecialPrime(int num, boolean[] isPrime) {
        Set<String> permutations = new HashSet<>();
        permuteDigits(String.valueOf(num), "", permutations);
        for (String permutation : permutations) {
            int permNum = Integer.parseInt(permutation);
            if (permNum >= isPrime.length || !isPrime[permNum]) {
                return false;
            }
        }
        return true;
    }

    private static void permuteDigits(String str, String ans, Set<String> permutations) {
        if (str.length() == 0) {
            permutations.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permuteDigits(ros, ans + ch, permutations);
        }
    }
}

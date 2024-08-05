import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primes = findPrimes(limit);
        System.out.println("Prime numbers up to " + limit + ": " + primes);
    }

    public static List<Integer> findPrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

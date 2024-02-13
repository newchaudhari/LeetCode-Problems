package arrays;

//https://leetcode.com/problems/count-primes/description/
public class CountPrimes {
    public static void main(String[] args) {
//        System.out.println(countPrimes(10));
        System.out.println(prime(10));
    }

    // Used to find prime no. but time limit exceeded
    public static int countPrimes(int n) {
        if (n <= 1) return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }


    //First approach, time complexity is 103 ms. Try Another approach
    static int prime(int n){
        int count=0;
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                count++;
        }
        return count;
    }
}

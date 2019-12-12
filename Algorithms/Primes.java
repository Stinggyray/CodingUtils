package Utils.Algorithms;

import java.util.ArrayList;

public class Primes {

    //Finds all primes less than or equal to n.

    public static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] primeList = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            primeList[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (primeList[p]) {
                for (int i = p * p; i <= n; i += p)
                    primeList[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeList[i])
                primes.add(i);
        }
        return primes;
    }


    //Better way to find if a number is prime or not
    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
}

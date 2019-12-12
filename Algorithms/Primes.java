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


    //
}

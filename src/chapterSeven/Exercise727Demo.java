package chapterSeven;

public class Exercise727Demo {
        public static void main(String[] args) {
            boolean[] primes = new boolean[1000]; // Initialize all elements to true by default

            // Set 0 and 1 to false because they are not prime
            primes[0] = false;
            primes[1] = false;

            // Loop through all elements of the array and mark non-prime numbers as false
            for (int i = 2; i < primes.length; i++) {
                if (primes[i]) {
                    // i is prime, mark all its multiples as non-prime
                    for (int j = i * 2; j < primes.length; j += i) {
                        primes[j] = false;
                    }
                }
            }

            // Display all the prime numbers between 2 and 999
            for (int i = 2; i < primes.length; i++) {
                if (primes[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }


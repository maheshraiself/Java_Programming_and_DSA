package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    If pq = n (i.e. p x q = n) then it can't be that
    p > sqrt(n) && q > sqrt(n)
    Most of the most they can be
    p = sqrt(n) && q = sqrt(n)

    So, if we find any factor before sqrt(n) of a number(n) then that means the number is
    not prime as it would then have three divisors (1, div giving rem zero(factor), num itself).

    Whereas in case, if the number(n) doesn't have any factor till sqrt(n) then that means
    the number(n) is a prime number as already mentioned that it would not have any factor after
    sqrt(n) if it fulfills the criteria of pq = n
    So, there will be only two factors (1, the num itself). Hence, a prime number.

    1 is not checked as it divides all the integers so the number(n) shouldn't have any factor
    starting for 2 till sqrt(n) to be a prime number.

    Either use i<=Math.sqrt(n) or i*i<=n and break statement to optimise the code.
*/


public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primeNumberUpto(int num) {
        int n = 2;
        List<Integer> list = new ArrayList<>();

        while (n <= num) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(n);
            }
            n++;
        }
        return list;
    }

    public static List<Integer> primeNumberInRange(int start, int end) {
        int n = (start == 1) ? (++start) : (start);
        List<Integer> list = new ArrayList<>();

        while (n <= end) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(n);
            }
            n++;
        }
        return list;
    }

    //Sieve of Eratosthenes Algorithm

    /*
        Suppose all the numbers till (n) are prime numbers and take a boolean array of size (n+1) and
        mark all the positions as true. Then start (i) from 2 till sqrt(n) and whatever number is a
        multiple of (i) mark the position of that number as false in the boolean array.

        Because the number(n) is a multiple of some number before itself, so it can't be a prime number.

        Hence, all the positions at the end left with true will be prime as they are not cancelled out
        by any previous number.

        Overall, the Sieve of Eratosthenes is one of the most efficient ways to find prime numbers and
        is especially effective when the upper limit for finding primes is not too large.
     */
    public static List<Integer> primeNumberUptoUsingSOE(int num) {
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);

        for (int p = 2; p <= Math.sqrt(num); p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= num; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Choose from following options:");
            System.out.println("1. Check Prime");
            System.out.println("2. Prime Upto");
            System.out.println("3. Prime in Range");
            System.out.println("4. Prime Upto Using SOE");
            System.out.println("5. Exit");
            System.out.println();

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter any Integer Number");
                    System.out.println(isPrime(sc.nextInt()));
                    break;

                case 2:
                    System.out.println("Enter any Integer Number");
                    System.out.println(primeNumberUpto(sc.nextInt()));
                    break;

                case 3:
                    System.out.println("Enter Start and End (Range)");
                    System.out.println(primeNumberInRange(sc.nextInt(), sc.nextInt()));
                    break;

                case 4:
                    System.out.println("Enter any Integer Number");
                    System.out.println(primeNumberUptoUsingSOE(sc.nextInt()));
                    break;

                case 5:
                    System.out.println("Thank You !!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Input");
            }

            System.out.println();
        }

//        System.out.println(isPrime(50));
//        System.out.println(isPrime(23));
//        System.out.println(primeNumberUpto(50));
//        System.out.println(primeNumberInRange(1,100));

    }
}

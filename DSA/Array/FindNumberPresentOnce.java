package DSA.Array;

import java.util.HashMap;

public class FindNumberPresentOnce {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 1, 3, 2, 5, 9};
        System.out.println(getSingleElement4(arr));
    }

    //BruteForce Approach - O(n^2)
    public static int getSingleElement1(int[] arr) {
        for (int i : arr) {
            int count = 0;

            for (int j : arr) {
                if (i == j)
                    count++;
            }
            if (count == 1)
                return i;
        }
        return -1;
    }

    /* Hashing can be done in two different ways, they are the following:
    1. Array hashing(not applicable if the array contains negatives or very large numbers)
    2. Hashing using the map data structure */

    /* Note: While searching for the answer finally, we can either use a loop from 0 to n (i.e. Size of the array) or use a loop from 0 to maxElement. So, the time complexity will change accordingly. */

    //Better Approach 1 - O(n)/O(n+1)
    public static int getSingleElement2(int[] arr) {
        int[] freq = new int[arr.length + 1];

        for (int i : arr) {
            freq[i]++;
        }

        for (int i : arr) {
            if (freq[i] == 1)
                return i;
        }
        return -1;
    }

    //Better Approach 2 -
    public static int getSingleElement3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : map.keySet()) {
            if (map.get(i) == 1)
                return i;
        }

        return -1;
    }

    //Optimal Approach 2 - O(n)
    public static int getSingleElement4(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        return xor;
    }

}

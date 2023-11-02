package DSA.Array;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 8, 7, 4};
        int n = 8;

        System.out.println(findMissing4(arr, n));
    }

    //BruteForce Approach - O(n^2)
    public static int findMissing1(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return i;
        }
        return -1;
    }

    //Better Approach - O(2n)/O(n) - O(n)/O(n)
    public static int findMissing2(int[] arr, int n) {
        int[] freq = new int[n + 1];

        for (int i : arr)
            freq[i]++;

        for (int i = 1; i <= freq.length; i++) {
            if (freq[i] == 0)
                return i;
        }
        return -1;
    }

    //Optimal Approach - O(n)
    //For a big value of n, sum will overflow and hence, XOR approach is slightly better than this.
    public static int findMissing3(int[] arr, int n) {
        int sum = 0;
        int naturalSum = (n * (n + 1)) / 2;

        for (int i : arr) {
            sum += i;
        }
        return naturalSum - sum;
    }

    //Optimal Approach - O(n)
    /* Two important properties of XOR are the following:
    XOR of two same numbers is always 0 i.e. a ^ a = 0.   ← Property 1.
    XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.   ← Property 2 */
    public static int findMissing4(int[] arr, int n) {
        int xor = 0;

        for (int i = 1; i < n; i++) {
            xor = xor^i^arr[i-1];
        }
        return xor^n;
    }

}

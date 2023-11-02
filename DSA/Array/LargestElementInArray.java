package DSA.Array;

import java.util.Arrays;

/* The same function will work for SmallestElementInArray by making a few tweaks */
public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {23, -54, 12, 90, 71, -22};
        findLargest1(arr);
        findLargest2(arr);
        System.out.println(findLargest3(arr));
    }

    //BruteForce Approach - O(n*log(n))
    public static void findLargest1(int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    //Optimised Approach - O(n)
    public static void findLargest2(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i > max)
                max = i;
        }
        System.out.println(max);
    }

    //Recursive Approach
    public static int findLargest3(int[] arr){
        if(arr.length == 1)
            return arr[0];

        int maxInRest = findLargest3(Arrays.copyOfRange(arr, 1, arr.length));

        return Math.max(arr[0], maxInRest);
    }

}

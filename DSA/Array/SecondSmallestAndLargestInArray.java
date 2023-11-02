package DSA.Array;

import java.util.Arrays;

public class SecondSmallestAndLargestInArray {
    
    public static void main(String[] args) {
        int[] arr = {23, -54, 12, 90, 71, -22};
        findSecondSmallestAndLargest1(arr);
    }

    //BruteForce Approach - O(n*log(n))
    public static void findSecondSmallestAndLargest1(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second Smallest " + arr[1]);
        System.out.println("Second Largest " + arr[arr.length - 2]);
    }

    //Better Approach - O(2n) -> O(n)
    public static void findSecondSmallestAndLargest2(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        for (int i : arr) {
            if(i < secMin && i > min)
                secMin = i;

            if(i > secMax && i < max)
                secMax = i;
        }

        System.out.println("Second Smallest " + secMin);
        System.out.println("Second Largest " + secMax);
    }

    //Optimised Approach - O(n)
    public static void findSecondSmallestAndLargest3(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if(i < min){
                secMin = min;
                min = i;
            }else if(i < secMin && i != min)
                    secMin = i;

            if(i > max){
                secMax = max;
                max = i;
            }else if(i > secMax && i != max)
                secMax = i;
        }

        System.out.println("Second Smallest " + secMin);
        System.out.println("Second Largest " + secMax);
    }

}

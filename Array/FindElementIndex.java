package Array;

import java.util.Scanner;

public class FindElementIndex {

    public static int findElementIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter element whose position is to be found");
        int val = sc.nextInt();
        int index = findElementIndex(arr, val);
        System.out.println("Element found at index: " + index);
    }
}

package Array;

import java.util.Scanner;

public class SumOfTwoArrays {

    public static void printTwoArraySum(int[] arr1, int[] arr2) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements for array 1");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of array 2");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements for array 2");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        printTwoArraySum(arr1, arr2);
    }
}

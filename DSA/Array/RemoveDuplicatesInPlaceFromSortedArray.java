package DSA.Array;

import java.util.HashSet;

public class RemoveDuplicatesInPlaceFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int size = removeDuplicatesInPlace1(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //BruteForce Approach - /O(n)
    public static int removeDuplicatesInPlace1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;

        for (int i : arr) {
            if(set.add(i))
                arr[index++] = i;
        }
        return index;
    }

    //Optimal Approach - O(n)
    public static int removeDuplicatesInPlace2(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
        }
        return i+1;
    }

}

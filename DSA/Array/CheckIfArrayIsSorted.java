package DSA.Array;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = {23, -54, 12, 90, 71, -22};
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int[] sortedArr1 = {};
        int[] sortedArr2 = {5};

        System.out.println(checkIfSorted1(arr));
        System.out.println(checkIfSorted1(sortedArr));
        System.out.println(checkIfSorted1(sortedArr1));
        System.out.println(checkIfSorted1(sortedArr2));
    }

    //BruteForce Approach - O(n^2)
    public static boolean checkIfSorted1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    return false;
            }
        }
        return true;
    }

    //Optimised Approach - O(n)
    public static boolean checkIfSorted2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }
        return true;
    }
}

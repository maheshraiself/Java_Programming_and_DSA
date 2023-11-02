package DSA.Array;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int[] arr = {23, -54, 12, 90, 71, -22};
        leftRotate(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //Optimal Approach - O(n)
    public static void leftRotate(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

}

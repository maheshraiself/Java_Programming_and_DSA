package DSA.Array;

public class ArrayDefinition {

    public static void main(String[] args) {
        //Type - 1
        int[] arr = new int[5];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
        printArr(arr);

        //Type - 2
        int[] arr1 = {4, 5, 6, 7, 8};
        printArr(arr1);

        /* Array Declarations that are not allowed */
//        []int temp = new int[5];
//        int[] temp = new [5]int;

         /* Array Declarations that will work fine */
//        int temp[] = new int[5];
//        int      []   temp = new int[5];
//        printArr(temp);
    }

    public static void printArr(int[] arr){
        System.out.println(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }

        /*Another ways to print an Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
}

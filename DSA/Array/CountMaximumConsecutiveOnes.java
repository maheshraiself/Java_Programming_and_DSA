package DSA.Array;

public class CountMaximumConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(maxConsecutiveOnes(arr));
    }

    //Optimal Approach - O(n)
    public static int maxConsecutiveOnes(int[] arr) {
        int count = 0, maxCount = 0;

        for (int i : arr) {
            if(i == 1)
                count++;
            else
                count = 0;

            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }

}

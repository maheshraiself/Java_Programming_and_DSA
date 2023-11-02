package DSA.Array;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

//Elements in the union should be in ascending order.
public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 5, 9, 81};
        int[] arr2 = {3, 23, 23, 57, 72, 81};

        ArrayList<Integer> list = findUnion1(arr1, arr2);
        System.out.println(list);
    }

    //BruteForce Approach - O((m+n)*log(m+n))/O(m+n)
    //Works for unsorted arrays as well.
    public static ArrayList<Integer> findUnion1(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i : arr1)
            map.put(i, map.getOrDefault(i, 0) + 1);

        for (int i : arr2)
            map.put(i, map.getOrDefault(i, 0) + 1);

        return new ArrayList<>(map.keySet());
    }

    //BruteForce Approach - O((m+n)*log(m+n))/O(m+n)
    //Works for unsorted arrays as well.
    public static ArrayList<Integer> findUnion2(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i : arr1)
            set.add(i);

        for (int i : arr2)
            set.add(i);

        return new ArrayList<>(set);
    }

    //Optimal Approach - O(m+n)/O(m+n)
    public static ArrayList<Integer> findUnion3(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>(arr1.length + arr2.length);
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                if (list.isEmpty() || arr1[i] != list.get(list.size() - 1))
                    list.add(arr1[i]);
                i++;
            } else {
                if (list.isEmpty() || arr2[j] != list.get(list.size() - 1))
                    list.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            if (list.isEmpty() || arr1[i] != list.get(list.size() - 1))
                list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            if (list.isEmpty() || arr2[j] != list.get(list.size() - 1))
                list.add(arr2[j]);
            j++;
        }

        return list;
    }

}

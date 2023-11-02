package Conversion;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveArrayToList {

    public static void main(String[] args) {

        int[] primitiveArray = {1, 2, 3, 4, 5};

        List<Integer> list = new ArrayList<>();
        for (int i : primitiveArray) {
            list.add(i);
        }

        System.out.println(list);
    }
}

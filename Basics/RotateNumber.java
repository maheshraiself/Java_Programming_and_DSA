package Basics;

import java.util.Scanner;

public class RotateNumber {

    public static int rotate(int num, int k) {
        int temp = num;
        int nod = 0;    //nod - number of digits

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        k = k % nod;  //after rotating nod times we get the same number as result
        //if k is negative then rotate k+nod time instead of k times
        //for nod=5 and k=-2 let's not rotate is in other direction
        //instead rotate nod+k (5-2 = 3) times in the same direction, and it would give the same result.
        k = (k < 0) ? (k + nod) : k;
        int mul = (int) Math.pow(10, k);
        int div = (int) Math.pow(10, nod - k);

        int quo = num / div;
        int rem = num % div;

        return rem * mul + quo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num and k");
        System.out.println(rotate(sc.nextInt(), sc.nextInt()));
    }
}

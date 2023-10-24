package Patterns;

import java.util.Scanner;

/*
TODO: complete  Pattern 15 from video
*/

public class Pattern_16 {

    public static void pattern_16(int n) {
        int sp = n / 2, st = 1;
        int val = 0;

        for (int i = 1; i <= n; i++) {
            if (i < ((n + 1) / 2)) {
                val++;
            } else {
                val--;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                if (j < ((n + 1) / 2)) {
                    val++;
                }else{
                    val--;
                }
            }

            if (i < ((n + 1) / 2)) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_16(num);
    }
}

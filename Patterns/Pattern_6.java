package Patterns;

import java.util.Scanner;

/*
                        *
                    *   *   *
                *   *   *   *   *
                    *   *   *
                        *
*/

public class Pattern_6 {
    public static void pattern_6(int n) {
        int sp = n / 2, st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
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

        pattern_6(num);
    }
}

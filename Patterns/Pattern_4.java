package Patterns;

import java.util.Scanner;

/*
                *   *   *   *   *
                    *   *   *   *
                        *   *   *
                            *   *
                                *
*/

public class Pattern_4 {

    public static void pattern_4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i<=j) {
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void pattern_4_1(int n) {
        int sp = 0, st = n;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            sp++; st--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_4(num);
        System.out.println("------------------------");
        pattern_4_1(num);
    }
}

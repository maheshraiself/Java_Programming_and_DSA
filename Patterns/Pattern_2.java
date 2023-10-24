package Patterns;

import java.util.Scanner;

/*
                *
                *   *
                *   *   *
                *   *   *   *
                *   *   *   *   *
 */

public class Pattern_2 {

    public static void pattern_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        pattern_2(num);
    }
}

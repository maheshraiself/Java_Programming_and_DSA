package Patterns;

import java.util.Scanner;

/*
                *   *   *   *   *
                *   *   *   *
                *   *   *
                *   *
                *
*/

public class Pattern_5 {
    public static void pattern_5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_5(num);
    }
}

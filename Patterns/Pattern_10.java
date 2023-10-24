package Patterns;

import java.util.Scanner;

/*
                *	 	 	 	*
                    *	 	*
                        *
                    *	 	*
                *	 	 	 	*
*/

public class Pattern_10 {
    public static void pattern_10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_10(num);
    }
}

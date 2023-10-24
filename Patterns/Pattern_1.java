package Patterns;

import java.util.Scanner;

/*
                    *	*	*	*	*
                    *	*	*	*	*
                    *	*	*	*	*
                    *	*	*	*	*
                    *	*	*	*	*
 */

public class Pattern_1 {

    public static void pattern_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        pattern_1(num);
    }
}

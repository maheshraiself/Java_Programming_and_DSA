package Patterns;

import java.util.Scanner;

/*
                    *	*	*	 	*	*	*
                    *	*	 	 	 	*	*
                    *	 	 	 	 	 	*
                    *	*	 	 	 	*	*
                    *	*	*	 	*	*	*
*/

public class Pattern_7 {

    public static void pattern_7(int n) {
        int sp = 1, st = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            if (i < ((n + 1) / 2)) {
                sp += 2;
                st--;
            } else {
                sp -= 2;
                st++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_7(num);
    }
}

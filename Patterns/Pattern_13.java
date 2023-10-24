package Patterns;

import java.util.Scanner;

/*
                0
                1	1
                2	3	5
                8	13	21	34
                55	89	144	233	377
*/

public class Pattern_13 {

    public static void pattern_13(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        pattern_13(num);
    }

}

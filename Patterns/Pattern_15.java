package Patterns;

import java.util.Scanner;

/*
                2 x 1 = 2
                2 x 2 = 4
                2 x 3 = 6
                2 x 4 = 8
                2 x 5 = 10
                2 x 6 = 12
                2 x 7 = 14
                2 x 8 = 16
                2 x 9 = 18
                2 x 10 = 20
*/

public class Pattern_15 {

    public static void pattern_15(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        pattern_15(num);
    }
}

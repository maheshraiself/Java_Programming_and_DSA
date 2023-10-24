package Basics;

import java.util.Scanner;

public class ReverseNumber {

    public static void reverse(int num) {
        int n = num;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        reverse(num);
    }
}

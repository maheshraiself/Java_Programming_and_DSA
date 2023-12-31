package Basics;

import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int num) {
        int n = num;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        System.out.println(countDigits(num));
    }
}

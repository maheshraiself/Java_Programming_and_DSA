package Basics;

import java.util.List;
import java.util.Scanner;

public class FibonacciNumber {

    public static void printFibonacci(int num) {
        int a = 0, b = 1;
        //two numbers we are going to print already, so count = 2;
        int count = 2;
        System.out.print(a + " ");
        System.out.print(b + " ");

        while (count < num) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
            count++;
        }
    }

    public static void printFibonacci_1(int num) {
        int a = 0, b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a=b; b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();

        printFibonacci(num);
        System.out.println();
        printFibonacci_1(num);
    }
}

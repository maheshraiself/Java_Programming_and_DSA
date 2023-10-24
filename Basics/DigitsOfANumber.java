package Basics;

import java.util.Scanner;

public class DigitsOfANumber {

    public static void digits(int num){
        int nod = 0;    //nod - number of digits
        int temp = num;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);  //for 5431 it'll give us 1000
        int n = num;

        while (div != 0) {
            System.out.print(n / div + " ");
            n = n % div;
            div = div / 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int num = sc.nextInt();
        digits(num);
    }
}

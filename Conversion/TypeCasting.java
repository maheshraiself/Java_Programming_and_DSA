package Conversion;

import java.util.Scanner;

/*
    We can convert int to long in java using assignment operator. There is nothing to do extra
    because lower type can be converted to higher type implicitly. It is also known as implicit type casting
    or type promotion.  -   Widening TypeCasting

    We can convert long to int in java using typecasting. To convert higher data type into lower,
    we need to perform typecasting. Typecasting in java is performed through typecast operator (datatype).
    -   Narrowing TypeCasting
*/

public class TypeCasting {

    //TODO: needs to be completed
    public static void intToLong(int num) {
        long l = num;
        System.out.println(l);
    }

    public static void intToLongObject(int num) {
        Long l2 = (long) num;
        System.out.println(l2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose from the below options");
            System.out.println("1. int to long");
            System.out.println();


            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter any num");

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

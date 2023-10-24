package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InbuiltExceptions {

    public static void arithmeticException() {
        int a = 50 / 0;
    }

    public static void nullPointerException() {
        String str = null;
        System.out.println(str.charAt(0));
    }

    public static void stringIndexOutOfBounds() {
        String str = "hello";
        System.out.println(str.charAt(8));
    }

    public static void fileNotFoundException() {
        File file = new File("E://file.text");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void numberFormatException() {
        int num = Integer.parseInt("abc");
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] arr = new int[5];
        System.out.println(arr[6]);
    }

    public static void ioException() {

    }

    public static void noSuchMethodException() {

    }

    public static void illegalArgumentException() {

    }

    public static void illegalStateException() {

    }

    public static void classNotFoundException() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose from the below options");
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. NullPointer Exception");
            System.out.println("3. StringIndexOutOfBounds Exception");
            System.out.println("4. FileNotFound Exception - Checked");
            System.out.println("5. NumberFormat Exception");
            System.out.println("6. ArrayIndexOutOfBounds Exception");
            System.out.println("7. IO Exception");
            System.out.println("8. NoSuchMethod Exception");
            System.out.println("9. IllegalArgument Exception");
            System.out.println("10. IllegalState Exception");
            System.out.println("11. ClassNotFound Exception");
            System.out.println();


            switch (sc.nextInt()) {
                case 1:
                    arithmeticException();
                    break;

                case 2:
                    nullPointerException();
                    break;

                case 3:
                    stringIndexOutOfBounds();
                    break;

                case 4:
                    fileNotFoundException();
                    break;

                case 5:
                    numberFormatException();
                    break;

                case 6:
                    arrayIndexOutOfBoundsException();
                    break;

                case 7:
                    ioException();
                    break;

                case 8:
                    noSuchMethodException();
                    break;

                case 9:
                    illegalArgumentException();
                    break;

                case 10:
                    illegalStateException();
                    break;

                case 11:
                    classNotFoundException();
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}

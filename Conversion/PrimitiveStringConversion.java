package Conversion;

import java.util.Scanner;

/*
    String object to primitive data type - parsing (parse method of Wrapper class)
    Primitive data type to String object - valueOf(String class), toString(Wrapper class), format()(String class)
    String to char - charAt(index)(String class), toCharArray()(String class)

    To take character as input from Scanner object - sc.next().charAt(0)

    stringToBoolean(String str) - To get boolean true, string must contain "true". Here, case is ignored.
    So, "true" or "TRUE" will return boolean true. Any other string value except "true" returns boolean false.
 */

public class PrimitiveStringConversion {

    public static void stringToInt(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    public static void stringToInteger(String str) {
        Integer numObj = Integer.valueOf(str);
        System.out.println(numObj);
    }

    public static void intToString(int num) {
        String str = String.valueOf(num);
        String str1 = Integer.toString(num);
        String str2 = String.format("%d", num);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void stringToLong(String str) {
        long num = Long.parseLong(str);
        System.out.println(num);
    }

    public static void longToString(Long num) {
        String str = String.valueOf(num);
        String str1 = Long.toString(num);
        String str2 = String.format("%d", num);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void stringToFloat(String str) {
        float num = Float.parseFloat(str);
        System.out.println(num);
    }

    public static void floatToString(float num) {
        String str = Float.toString(num);
        String str1 = String.valueOf(num);
        String str2 = String.format("%f", num);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void stringToDouble(String str) {
        double num = Double.parseDouble(str);
        System.out.println(num);
    }

    public static void doubleToString(double num) {
        String str = Double.toString(num);
        String str1 = String.valueOf(num);
        String str2 = String.format("%f", num);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void stringToChar(String str) {
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println("----------------");

        char[] charArr = str.toCharArray();
        for(char c : charArr){
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void charToString(char ch) {
        String str = Character.toString(ch);
        String str1 = String.valueOf(ch);
        String str2 = String.format("%c", ch);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void stringToBoolean(String str) {
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }

    public static void booleanToString(boolean b) {
        String str = Boolean.toString(b);
        String str1 = String.valueOf(b);
        String str2 = String.format("%b", b);
        System.out.println(str + " " + str1 + " " + str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose from the below options");
            System.out.println("1. String to int");
            System.out.println("2. String to Integer");
            System.out.println("3. int to String");
            System.out.println("4. String to long");
            System.out.println("5. long to String");
            System.out.println("6. String to float");
            System.out.println("7. float to String");
            System.out.println("8. String to double");
            System.out.println("9. double to String");
            System.out.println("10. String to char");
            System.out.println("11. char to String");
            System.out.println("12. String to boolean");
            System.out.println("13. boolean to String");
            System.out.println();


            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter any String");
                    stringToInt(sc.next());
                    break;

                case 2:
                    System.out.println("Enter any String");
                    stringToInteger(sc.next());
                    break;

                case 3:
                    System.out.println("Enter any int");
                    intToString(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter any String");
                    stringToLong(sc.next());
                    break;

                case 5:
                    System.out.println("Enter any long");
                    longToString(sc.nextLong());
                    break;

                case 6:
                    System.out.println("Enter any String");
                    stringToFloat(sc.next());
                    break;

                case 7:
                    System.out.println("Enter any float");
                    floatToString(sc.nextFloat());
                    break;

                case 8:
                    System.out.println("Enter any String");
                    stringToDouble(sc.next());
                    break;

                case 9:
                    System.out.println("Enter any double");
                    doubleToString(sc.nextDouble());
                    break;

                case 10:
                    System.out.println("Enter any String");
                    stringToChar(sc.next());
                    break;

                case 11:
                    System.out.println("Enter any char");
                    charToString(sc.next().charAt(0));
                    break;

                case 12:
                    System.out.println("Enter any String");
                    stringToBoolean(sc.next());
                    break;

                case 13:
                    System.out.println("Enter any boolean");
                    booleanToString(sc.nextBoolean());
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
    }

}

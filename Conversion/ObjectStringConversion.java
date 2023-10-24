package Conversion;

import java.util.Scanner;

/** <pre>
    We can convert String to Object in java with assignment operator. Each class is internally
    a child class of Object class. So you can assign string to Object directly.

    We can convert Object to String in java using toString() method of Object class
    or String.valueOf(object) method.

    You can convert any object to String in java whether it is user-defined class,
    StringBuilder, StringBuffer or anything else.

    For user-defined classes, the reference id(memory block name) of the object get printed on the console.
 </pre>
*/

public class ObjectStringConversion {

    public static void stringToObject(String str) {
        Object obj = str;
        System.out.println(obj);
    }

    public static void objectToString() {
        ObjectStringConversion objectStringConversion = new ObjectStringConversion();
        StringBuilder sbuild = new StringBuilder("abc");
        StringBuffer sbuff = new StringBuffer("def");

        System.out.println("Object to String");
        String str = objectStringConversion.toString();
        String str1 = String.valueOf(objectStringConversion);
        System.out.println(str + " " + str1);
        System.out.println("--------------------------");

        System.out.println("StringBuilder to String");
        String str2 = String.valueOf(sbuild);
        String str3 = sbuild.toString();
        System.out.println(str2 + " " + str3);
        System.out.println("--------------------------");

        System.out.println("StringBuffer to String");
        String str4 = String.valueOf(sbuff);
        String str5 = sbuff.toString();
        System.out.println(str4 + " " + str5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose from the below options");
            System.out.println("1. String to Object");
            System.out.println("2. Object to String");
            System.out.println();


            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter any String");
                    stringToObject(sc.next());
                }
                case 2 -> {
                    objectToString();
                }
                default -> System.out.println("Wrong choice");
            }
        }
    }
}

package com.tirgul;


import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class functions {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Q1
        System.out.println("Hello World");
        line();
        System.out.println("My name is Nino");
        line();
    }

    public static void line() {
        for (int i = 0; i < 15; i++){
            System.out.print("_");
        }
        System.out.println();

         */
        /* Q2
        System.out.println("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("Please enter your last name : ");
        String lastName = s.nextLine();
        String description = "test two: ";

        equals(name, lastName, description);
    }
    public static void equals (String str1, String str2, String description) {
        if (str1.equals(str2))
            System.out.println(description + "The String are equals");
        else System.out.println(description + "The String are not equals");

         */
        /* Q3
        System.out.println("Enter string: ");
        String string = s.nextLine();
        some_string(string);

    }
    public static void some_string(@NotNull String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char x = str1.charAt(i);
            if (x == ' ')
                count++;
        }
        System.out.println("Number of spaces: " +count);
        System.out.println("Number of chars without spaces: " + (str1.length() - count));

         */
        /* Q1 _ part2
        System.out.println("Please enter some string: ");
        String str1 = s.nextLine();
        System.out.println(words(str1));

    }
        public static int words(String str1) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ')
                    count++;
            }
            if (str1.charAt(0) == ' ')
                count--;

            if (str1.charAt(str1.length() - 1) == ' ')
                count--;

            return count + 1;

         */

        /*  Q2
        System.out.println("Please enter some string: ");
        String str1 = s.nextLine();
        System.out.println(uppercase(str1));
    }

    public static String uppercase (String str1) {
        String up = "No Lowercases";
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLowerCase(str1.charAt(i))) {
                up = str1.toUpperCase();
            }
        }
        return up;
    }
    */
        /* Q3
        ecPali();
    }
    public static void ecPali () {
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        if ( n == 1)
            System.out.println("Ec");
        else System.out.println("Pali");
    }
    */
        /* Q4
        System.out.println(randomChar());
    }

    public static char randomChar () {
        Random rand = new Random();
        char n = (char) (rand.nextInt(26) + 'a');
        return n;
    }
    */
        /* Q5 + Q6 */
        char x = randomChar();
        char y = randomChar();
        String str1 = equal(x,y);
        int count = 0;
        for (int i = 0; i < 5; i++){
            if (str1.equals("Equals"))
                count++;
        }
        if (count == 5)
            System.out.println("Is rundom");
        else System.out.println("Is not rundom");
    }


    public static char randomChar () {
        Random rand = new Random();
        char n = (char) (rand.nextInt(26) + 'a');
        System.out.println(n);
        return n;
    }

    public static String equal (char x, char y) {
        String isEquals = null;
        if (x != y)
             isEquals = "Equals";//System.out.println("Equals");
        //else System.out.println("Not equals");
        else isEquals = "Not equals";
        return isEquals;
        }
}



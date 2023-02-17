package com.sumExercise;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class hotToastEx1Functions {

    public static int ageValidation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age? ");
        String age = scan.nextLine();
        while (!isInteger(age)) {
            System.out.println("Not a valid number - please retry: ");
            age = scan.nextLine();
        }
        int intAge = Integer.parseInt(age);
        while (!validAge_5_100(intAge)) {
            System.out.println("Please re-enter the valid age between 5-100: ");
            intAge = scan.nextInt();
        }
        return intAge;
    }


    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }


    public static boolean validAge_5_100(int age){
        return age >= 5 && age <= 100;
    }


    private static String fixString (String string){
        string = string.replaceAll("\\s+", "");
        string = string.toLowerCase();
        return string;
    }


    private static String howMany(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many? ");
        String extras = scan.nextLine();
        while (!isInteger(extras)) {
            System.out.println("Not a valid number - please retry: ");
            extras = scan.nextLine();
        }
        return extras;
    }


    public static int toppings() {
        int toppings = 0;
        int cost = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add some extras? [Yes/No] ");
        String answer = scan.nextLine();
        while (answer!=null) {
            answer = fixString(answer);
            if (answer.equals("no")) {
                System.out.println("Are you sure? [Yes/No]");
                answer = scan.nextLine();
                if (answer.equals("yes")) {
                    return toppings;
                } else if (answer.equals("no")) {
                    int intExtras = Integer.parseInt(howMany());
                    return intExtras * cost;
                }
            } else if (answer.equals("yes")) {
                int intExtras = Integer.parseInt(howMany());
                return intExtras * cost;
            } else {
                System.out.println("Please choose one of the options only - [Yes/No]");
                answer = scan.nextLine();
            }
        }
        return toppings;
    }


    public static int drink() {
        int drink = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want some drink? [Cola/Orange/No]");
        String choice = scan.nextLine();
        while (choice!=null) {
            choice = fixString(choice);
            if (choice.equals("cola") || choice.equals("orange")) {
                return drink = 8;
            } else if (choice.equals("no")) {
                return drink;
            } else {
                System.out.println("Please choose one of the options only - Cola/Orange/No");
                choice = scan.nextLine();
            }
        }
        return drink;
    }
}


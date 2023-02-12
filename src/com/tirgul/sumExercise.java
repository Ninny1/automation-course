package com.tirgul;

import java.util.Scanner;

public class sumExercise {
    public static void main(String[] args) {

        int coast = 15;
        int age = sumExercise.ageValidation();
        int additions = sumExercise.additions();
        if (age >= 15 && age <= 18) {
            int discount = -5;
            System.out.println("Woohoo, you've got an 5 shekel discount - 'Hanaxat noar'");
            System.out.println("Total before additions: " + (coast + discount ));
            System.out.println("Total after additions: " + (coast + discount + additions));
        }
        else System.out.println("Total: " + (coast + additions ));
    }

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
        return age > 5 && age < 100;
    }

    //public static String drink() {

    //}
    public static int additions () {
        int additions = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add some extras? [Yes/No] ");
        String answer = scan.nextLine();
        if (answer.equals("No") || answer.equals("no")) {
            System.out.println("Are you sure? [Yes/No]" );
            answer = scan.nextLine();
            if (answer.equals("yes") || answer.equals("Yes")) {
                return additions;
            }
            else if (answer.equals("No") || answer.equals("no")) {
                    System.out.println("How many? ");
                    int extras = scan.nextInt();
                    additions = extras * 3;
                }
        }
        if (answer.equals("Yes") || answer.equals("yes")){
            System.out.println("How many? ");
            int extras = scan.nextInt();
            additions = extras*3;
        }
        return additions;
    }

}





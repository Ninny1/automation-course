package com.sumExercise;

import java.util.Scanner;

public class hotToastEx2Functions {

    public static int ageValidation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age? ");
        String age = scan.nextLine();
        while (isInteger(age)) {
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


    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }


    private static boolean validAge_5_100(int age) {
        return age >= 5 && age <= 100;
    }


    private static String fixString (String string){
        string = string.replaceAll("\\s+", "");
        string = string.toLowerCase();
        return string;
    }


    public static int toppings() {
        Scanner scan = new Scanner(System.in);
        int toppings3 = 0, toppings4 = 0, count3 = 0, count4 = 0;
        int cost3 = 3;
        int cost4 = 4;
        boolean toppings = true , continues = true; //הוספת משתנה כדי להחליט מתי הלולאה הראשית תמשיך ומתי לא
        System.out.println("Please choose toppings: Olives | Corn | Mushrooms | Onion | Tomatoes | Cheese | None");
        System.out.println("Type each one with ',' between them [for example: Olives,Cheese,Onion]");
        String answer = scan.nextLine();
        answer = fixString(answer);
        if (answer.equals("none")) {
            System.out.println("Are you sure? [Yes/No]");

            answer = fixString(answer);
            if (answer.equals("yes")) {
                toppings = false;
            } else {
                System.out.println("Please choose toppings: Olives | Corn | Mushrooms | Onion | Tomatoes | Cheese | None");
                System.out.println("Type each one with ',' between them [for example: Olives,Cheese,Onion]");
                answer = scan.nextLine();
            }
        }
        while (toppings) {
            String[] splitAnswer = answer.split("\\s*,\\s*");
            loop:  //נתינת שם ללולאה על מנת שהברייק יצא גם מהסוויץ וגם מהלולאה
            for (String s : splitAnswer) {
                s = fixString(s);
                switch (s) {
                    case "olives", "corn", "mushrooms" -> {
                        count3++;
                        toppings3 = cost3 * count3;
                        continues = true;
                    }
                    case "onion", "tomatoes", "cheese" -> {
                        count4++;
                        toppings4 = cost4 * count4;
                        continues = true;
                    }
                    default ->{
                        System.out.println("Olives | Corn | Mushrooms | Onion | Tomatoes | Cheese | None");
                        System.out.println("Type each one with ',' between them [for example: Olives,Cheese,Onion]");
                        answer = scan.nextLine();
                        splitAnswer = answer.split("\\s*,\\s*");
                        continues = false;
                        break loop;
                    }
                }
            }
            if (continues){
                toppings = false;
            }
        }
        return toppings3 + toppings4;
    }


    public static int drink() {
        int drink = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want some drink? [Cola/Orange/No]");
        String choice = scan.nextLine();
        while (choice!=null) {
            choice = fixString(choice);
            if (choice.equals("cola") || choice.equals("orange")) {
                System.out.println("To order, type - 'Send' \nTo exit, type - 'Exit'");
                String sendExit = scan.nextLine();
                sendExit = fixString(sendExit);
                if(sendExit.equals("send"))
                    return drink = 8;
                if (sendExit.equals("exit"))
                    return drink;
            }
            else if (choice.equals("no")) {
                return drink;
            } else {
                System.out.println("Please choose only one option - Cola/Orange/No");
                choice = scan.nextLine();
            }
        }
        return drink;
    }
}

package com.sumExercise;

public class hotToastEx2 {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Hot Toast \n");
        int cost = 15;
        int age = hotToastEx2Functions.ageValidation();
        int additions = hotToastEx2Functions.toppings();
        int drink = hotToastEx2Functions.drink();
        if (age >= 15 && age <= 18) {
            int discount = -5;
            System.out.println("Woohoo, you've got an 5 shekel discount - 'Hanaxat noar'");
            System.out.println("Total: " + (cost + discount + additions + drink));
            System.out.println("Bon appetite");
        } else {
            System.out.println("Total: " + (cost + additions + drink));
            System.out.println("Bon appetite");
        }
    }
}

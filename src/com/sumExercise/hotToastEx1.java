package com.sumExercise;

public class hotToastEx1 {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Hot Toast \n");
        int cost = 15;
        int age = hotToastEx1Functions.ageValidation();
        int additions = hotToastEx1Functions.toppings();
        int drink = hotToastEx1Functions.drink();
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
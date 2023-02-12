package com.tirgul;
import java.util.Scanner;

public class switchTry {
    public static void main(String[] args) {
        /* Q1
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  the number: ");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("The number is not in range");
                break;
        } */
        /* Q2
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the month number: ");
        int month = s.nextInt();
        System.out.println("Please enter the year: ");
        int year = s.nextInt();
        //if ((month==2) && ((year%4==0) || ((year%100==0) && (year%400==0))))
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
                System.out.println("The number of days is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 12:
                System.out.println("The number of days is 30");
                break;
            case 2:
                if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
                    System.out.println("The number of days is 29");
                else System.out.println("The number of the days is 28");
                break;
            default:
                System.out.println("Please enter the number between 1-12");
        } */
        /* Q3
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 3 scores: ");
        int score1 = s.nextInt();
        int score2 = s.nextInt();
        int score3 = s.nextInt();
        double score = (score1+score2+score3)/3;
        if ( score >= 90)
            System.out.println("Your score is: A");
        if (score >= 70 && score < 90)
            System.out.println("Your score is: B");
        if (score >= 50 && score < 70)
            System.out.println("Your score is: C");
        if (score < 50)
            System.out.println("Your score is: D");
         */
        /* Q4
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter how many sufganiot you bought: ");
        int sufganiot = s.nextInt();
        System.out.println("How much does it cost: ");
        double cost = s.nextDouble();
        double sum = sufganiot * cost;
        double discount;
        if (sum >= 100 && sum <= 120) {
            discount = sum * 0.9;
            System.out.println("You got " + (sum - discount) + " discount");
        }
        if (sum > 120 && sum <= 200) {
            discount = sum * 0.8;
            System.out.println("You got " + (sum - discount) + " discount");
        }
        if (sum > 200) {
            discount = sum * 0.75;
            System.out.println("You got " + (sum - discount) + " discount");
        }
        if (sum < 100)
            System.out.println("No discount");
         */
        /* Q6
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if (num1 == num2){
            if (num2 == num3)
                System.out.println("Numbers are equals");
            else System.out.println("Just 2 numbers are equals");
        }
        else if (num1 == num3){
            if (num2 == num3)
                System.out.println("Numbers are equals");
            else System.out.println("Just 2 numbers are equals");
        }
        else if (num2 == num3){
            if (num3 == num1)
                System.out.println("Numbers are equals");
            else System.out.println("Just 2 numbers are equals");
        }
        else System.out.println("Are not equals");
        */
            /* Q5 */
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter the month number: ");
            int month_num = s.nextInt();
            String[] month = new String[12];
            month[0] = "January";
            month[1] = "February";
            month[2] = "March";
            month[3] = "April";
            month[4] = "May";
            month[5] = "June";
            month[6] = "July";
            month[7] = "August";
            month[8] = "September";
            month[9] = "October";
            month[10] = "November";
            month[11] = "December";
            switch (month_num) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Very cold in " + month[month_num - 1]);
                        break;
                case 5:
                case 6:
                case 7:
                    System.out.println("Quite comfortable in " + month[month_num - 1]);
                        break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("Very hot in " + month[month_num - 1]);
                        break;
                default:
                    System.out.println("There is no such month.");
                    break;
                }
            }
        catch (Exception e) {
                System.out.println("Errorrrrrrr");
        }
    }
}



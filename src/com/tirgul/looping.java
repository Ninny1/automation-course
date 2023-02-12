package com.tirgul;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        /* Q1
        for (int i = 1; i <= 10; i++) {
            if (i == 4)
                continue;
            System.out.println(i);
        } */
        /* Q2
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%7==0)
                System.out.println(i);
        }
         */
        /* Q3
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum =  sum + i;
            System.out.println(sum);
        }
         */
        /* Q4
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int sum = 0;
        for (int i = 1; i <=5; i++) {
            int num = s.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum is: " + sum);
         */
        /* Q5
        int count = 0;
        double sum = 0;
        Scanner s = new Scanner(System.in);

        for (count = 0; count < 10; count++) {
            System.out.println("Enter the number: ");
            int num = s.nextInt();
            if (num == 0)
                break;
            sum = sum + num;
        }
        System.out.println("The count of numbers is: " + count);
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + (sum/count));
         */
        /* Q6 + Q7
        int x = 1;
        int y = 1;
        while (y <= 10) {
            x = 1;
            while (x <= 10) {
                if (x*y < 10) {
                    System.out.print("0" + x * y + " ");
                    x++;
                }
                else {
                    System.out.print(x * y + " ");
                    x++;
                }
            }
            y++;
            System.out.println();
        } */
        /* Q6 + Q7 _ V2
        for (int y = 1; y <=10; y++) {
            for ( int x = 1; x <= 10; x++) {
                if ((x*y)<10) {
                    System.out.print("0" + x*y + " ");
                }
                else {
                    System.out.print(x*y + " ");
                }
            }
            System.out.println();
        }
        */
        /* Q8
        Scanner s = new Scanner(System.in);
        int x = (int) (Math.random() * 10) + 1;
        int count = 1;
        int first = 1;
        while (count <= 5) {
            if (first == 1) {
                System.out.println("Please enter the number: ");
                first = 2;
            } else {
                System.out.println("Enter again: ");
            }
            int num = s.nextInt();
            if (x == num) {
                System.out.println("Winner");
                break;
            }
            if (x > num)
                System.out.println("Your number is lower");
            else
                System.out.println("Your number is bigger");
            count++;
        }
        if (count == 6)
            System.out.println("Looser");
        */
        /* Q9
        int[] numbers = {544 ,547 ,725 ,507 ,980 ,485 ,601 ,319 ,408 ,69 ,360 ,651 ,984 ,402 ,951 ,942 ,105 ,236 ,592 ,984 ,390 ,219 ,575 ,865 ,617 ,263 ,501 ,141 ,
                165 ,83 ,615 ,941 ,345 ,953 ,615 ,328 ,978 ,597 ,566 ,823 ,375 ,236 ,344 ,907 ,418 ,47 ,462 ,386 ,217 ,687 ,949 ,626 ,950 ,866 ,248 ,826 ,566 ,412 ,
                237 ,918 ,219 ,758 ,162 ,399 ,717 ,742 ,445 ,831 ,843 ,379 ,81 ,553 ,767 ,894 ,892 ,24 ,512 ,58 ,104 ,67 ,815 ,753 ,328 ,721 ,126 ,380 ,440 ,857 ,
                93 ,685 ,854 ,753 ,688 ,451 ,842 ,609 ,958 ,470 ,527 ,743};
        int index = 0;
        while (index < numbers.length) {
            if (numbers[index] <= 217)
                System.out.print(numbers[index] + ", ");
            index++;
        }
        */
        /* Q10
        Scanner s = new Scanner(System.in);
        int posNums = 0;
        int negNums = 0;
        int zeroNums = 0;
        //boolean moreNums = false;
        char yesNo;
        do {
            System.out.println("Enter the number: ");
            int num = s.nextInt();
            if (num > 0)
                posNums++;
            if (num < 0)
                negNums++;
            if (num == 0)
                zeroNums++;
            System.out.println("Do you want to continue? ");
            yesNo = s.next().charAt(0);
            //moreNums = s.nextBoolean();
        } while (yesNo == 'y' || yesNo == 'Y');
        //while (moreNums);
        System.out.println("Positive: " + posNums + ", " + "Negative: " + negNums + ", " + "Zero: "+ zeroNums );
        */
        /* Q11
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        System.out.println("Enter the hizka: ");
        int hizka = s.nextInt();
        int i = 1;
        int result = 1;
        while (i <= hizka) {
            result = result * num;
            i++;
        }
        System.out.println(result);
         */

        // Specials

        /* Q1
        Scanner s = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char yesNo;
        do {
            System.out.println("Enter the number: ");
            int num = s.nextInt();
            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;
            System.out.println("Do you want to continue? y/n");
            yesNo = s.next().charAt(0);
        } while (yesNo == 'y' || yesNo == 'Y');
        System.out.println("The largest number is " + largest + " and the smallest number is " + smallest);
         */
        /* Q2
        int stars=7;
        for (int i = stars-1; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++)  {
                System.out.print("*" + " ");
            }
            System.out.println(); */
        /* V2
        int stars=7;
        for (int i = stars; i >= 1; i--) {
            for (int j = stars; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
         */
        /* Q3
        for (int i = 1 ; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 7-i; k >= 1; k--)
                System.out.print("*");

            System.out.println("");
        }
        */
        /* Q4
        int i, j, space = 1;
        int row = 7;
        space = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         */
        /* Q5 */
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number ");
        int counter = 0;
        int num = s.nextInt();
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        System.out.printf("NUMBER OF DIGITS IS %d", counter);
    }

    public static class inputs {
        public static void main (String[] args) {
            /* question 1
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = num.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = num.nextInt();
            System.out.println("The result is " + (num1+num2));
             */
            /* question 2
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = num.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = num.nextInt();
            System.out.println("The first number is bigger than the second? " + (num1>num2));
             */
            /* question 3
            Scanner num = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int num1 = num.nextInt();
            if (num1==0) {
                System.out.println("The number is 0");
            }
            else if (num1>0) {
                System.out.println("The number is positive");
            }
            else {
                System.out.println("The number is negative");
            }
            */
            /* question 4
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the numbers: ");
            int num1 = num.nextInt();
            int num2 = num.nextInt();
            int num3 = num.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1);
            }
            else if (num2 > num1 && num2 > num3) {
                System.out.println(num2);
            }
            else {
                System.out.println(num3);
            }
            */
            /* question 5
            Scanner num = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            int num1 = num.nextInt();
            if (num1 % 2 == 0) {
                System.out.println("The number " + num1 + " is zugi");
            }
            else {
                System.out.println("The number " + num1 + " is not zugi");
            }
            */
            /* question 6
            Scanner num = new Scanner(System.in);
            System.out.println("Please enter the number between 1-100");
            int num1 = num.nextInt();
            if (num1 >= 1 && num1 <= 100 ) {
                System.out.println("The number is: " + num1);
            }
            else if (num1 < 1) {
                System.out.println("The number is less than 1");
            }
            else {
                System.out.println("The number is bigger than 100");
            }
            */
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter your age: ");
            int age = s.nextInt();
            if (age >= 20 && age <= 50) {
                System.out.println("Please enter your height: ");
                int height = s.nextInt();
                if (height >= 180)
                {
                    System.out.println("Passed");
                }
                else {
                    System.out.println("Your are too short");
                }
            }
            else {
                System.out.println("Your are too young, or old");
            }

            }
        }
}


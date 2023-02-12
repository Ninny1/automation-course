package com.tirgul;

import java.util.Scanner;

import static com.tirgul.question_four.*;

public class question_four_main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = s.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = s.nextInt();
        int [] myArray = send_array(num1, num2, num3);
        int bigNum = biggest(myArray);
        question_four.send_num(bigNum);


        /*
        int num1, num2, num3;

        Scanner cons = new Scanner(System.in);
        System.out.println("enter num 1");
        num1 = cons.nextInt();
        System.out.println("enter num 2");
        num2 = cons.nextInt();
        System.out.println("enter num 3");
        num3 = cons.nextInt();

        int big = question_four.inarray(num1, num2, num3);

        question_four.send_num(big);
        */


    }
}

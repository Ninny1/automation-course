package com.tirgulJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your favorite number :");
            int x = scanner.nextInt();

            System.out.println("enter your second favorite number :");
            int y = scanner.nextInt();

            System.out.println(x * y);
        } catch (Exception e) {
            System.out.println("targil 1 failed" + e);
        }
    }
}

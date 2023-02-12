package com.tirgul;

public class sevenBoom {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i / 10 == 7 || i % 10 == 7)
                System.out.print("Boom! ");
            else System.out.print(i + ", ");
        }
    }
}

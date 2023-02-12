package com.tirgulJava;

public class myClass2 {

    public static void main(String[] args) {
        String firstName = "Ninny";
        String lastName = "Giorgadze";
        int age = 30;
        int x = 5;
        age = age + x;
        age = age - 1;

        String fullName = firstName + lastName;
        String[] names = new String[5];
        int lengthOfNames = names.length;
        int[] ages = new int[5];
        names[0] = "nini";
        names[1] = "ariel";
        names[2] = "sophie";
        names[3] = "bell";
        names[4] = firstName;
        firstName = "sofchik";
        System.out.println(names[2]);
        System.out.println(names[0] + " " + names[1]);
        System.out.println(names.length);

    }
}

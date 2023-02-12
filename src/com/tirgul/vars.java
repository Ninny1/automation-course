package com.tirgul;

public class vars {
    public static void main (String[] args) {
        int x = 10;
        int y = 10;
        System.out.println(x*y);
        String firstName = "Ninny";
        String childName = "Sophie";
        System.out.println(firstName + " + " + childName);
        int age = 30;
        System.out.println("Shalom, my name is " + firstName + ", And I'm " + age + " years old" );
        int first = 10;
        int second = 20;
        int third = 30;
        String result = "The result is: ";
        System.out.println(result + (first + second - third));
        String[] weekday = new String[7];
        weekday[0] = "Sunday";
        weekday[1] = "Monday";
        weekday[2] = "Tuesday";
        weekday[3] = "Wednesday";
        weekday[4] = "Thursday";
        weekday[5] = "Friday";
        weekday[6] = "Saturday";
        System.out.println(weekday[1] + "\n" + weekday[4]);


    }
}

package com.tirgul;

public class question_four {

    public static int[] send_array (int x, int y, int z){

        int[] myArray;
        myArray = new int[3];
        myArray[0] = x;
        myArray[1] = y;
        myArray[2] = z;
        return myArray;

        /*
    public static int inarray(int a, int b, int c) {

        int [] arr = {a,b,c};

        int big = biggest(arr);
        return big;

         */


    }
    private static int max (int num1, int num2) {
        if (num1 > num2)
            return num1;
        else return num2;
    }
    public static int biggest (int [] myArray) {

/*
        int biggest=Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > biggest)
                biggest = myArray[i];
        }
        return biggest;
        */

        return max(max(myArray[0], myArray[1]),myArray[2]);



    }


    public static void send_num (int x) {
        print_num(x);
    }

    public static void print_num (int num) {
        System.out.println(num);
    }

}

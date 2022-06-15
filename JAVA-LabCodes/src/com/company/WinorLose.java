package com.company;

import java.util.Scanner;

public class WinorLose {

    public static int largestInArr(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    public static int winOrLose(int num){
        if (num % 2 == 0){
           return 1;
        }else return 0;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many number you want to play with? ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the numbers ");
            for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
            int array = largestInArr(arr);
            int result = winOrLose(array);

            if (result == 1){
                System.out.println("Largest number is even: "+array+"YOU WON");
            }else System.out.println("Largest number is odd: "+array+"YOU LOSE");
    }
}




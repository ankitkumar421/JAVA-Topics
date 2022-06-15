package com.company;

import java.util.Scanner;

public class SumofDigit {

    public static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0){
            int temp = num % 10;
            sum = sum+temp;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to find sum: ");
        int num = sc.nextInt();
        int result = sumOfDigit(num);
        System.out.println("Sum of digit : "+ result);
    }
}

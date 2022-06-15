package com.company;

import java.util.Scanner;

public class PrimeNumber {

    public static int checkPrime(int check_value){
        int count = 0;
        for (int start = 1; start <= check_value; start++){
            if (check_value % start == 0){
                count = count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime: ");
        int num = sc.nextInt();
        int result = checkPrime(num);

        if (result == 2){
            System.out.println("Prime");
        }else
            System.out.println("Not Prime");
    }
}

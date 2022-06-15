package com.company;

import java.util.Scanner;

public class VowelCountInString {

    public static void checkVowel(String string){

        int count = 0;
        for (int initial = 0; initial < string.length(); initial++){
            if (string.charAt(initial) == 'a' || string.charAt(initial) == 'e' || string.charAt(initial) == 'i' || string.charAt(initial) == 'o'  || string.charAt(initial) == 'u'){
                count++;
                System.out.println("No of vowel are: "+ count);
            }
        }
    }

    public static void main(String[] args) {
        String string;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        string = sc.nextLine();

        checkVowel(string);
    }
}

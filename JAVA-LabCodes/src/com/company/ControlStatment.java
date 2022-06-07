package com.company;

public class ControlStatment {

    static int num1 = 5;
    static int num2 = 6;

    public static void ifStatement(){
        if (num1 > num2)
            System.out.println("Num1 is greater");
        System.out.println("Num2 is greater");
    }

    public static void switchStatement(){
        char ch = 'A';
        switch (ch)
        {
            case 'A':
                System.out.println ("Value is A");
                break;
            case 'B':
                System.out.println ("Value is B");
                break;
            default:
                System.out.println ("Unknown Value");
        }
    }

    public static void whileTest(){
        int start=1;
        while (start<=5)
        {
            System.out.println ("i =" + start);
            start++;
        }
    }

    public static void forTest(){
        int initial = 0;
        int sum = 0;
        for( initial = 0; initial <= 10; initial++)
            sum += initial;
            System.out.println ("The sum of first 10 Nos =" + sum );
    }

    public static void main(String[] args) {
        ifStatement();
        switchStatement();
        forTest();
        whileTest();
    }
}

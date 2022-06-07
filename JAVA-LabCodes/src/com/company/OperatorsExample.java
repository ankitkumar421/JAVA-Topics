package com.company;

public class OperatorsExample {

    static int num1 = 5;
    static int num2 = 6;
    static float num3 = 22.1f;
    static float num4 = 3.4f;

    static void incrementOperator(){
        System.out.println ("++num1 = " + ++num1);
        System.out.println ("num2++ = " + num2++);
        System.out.println ("num1 = " + num1);
        System.out.println ("num2 = " + num2);
    }

    static void bitwiseOperator(){
        System.out.println("num1 & num 2 = " + (num1 & num2));
        System.out.println("num1 | num 2 = " + (num1 | num2));
        System.out.println("num1 ^ num 2 = " + (num1 ^ num2));
    }

    static void arithmeticOperator(){
        System.out.println ("num3 + num4 =" + ( num3 + num4) ) ;
        System.out.println ("num3 - num4 =" + (num3 - num4) ) ;
        System.out.println ("num3 * num4 =" +( num3 * num4) );
        System.out.println ("num3 / num4 =" + ( num3 / num4 ) );
        System.out.println ("num3 % num4 =" + ( num3 % num4 ) );
    }

    static void relationalOperator(){
        System.out.println ("num1 < num2 =" + ( num1 < num2 ) );
        System.out.println ("num1 > num3 =" + (num1 > num3) );
        System.out.println ("num1 <= num3 =" + (num2 <= num3) );
        System.out.println ("num1 >= num2 =" + (num1 >= num2 ) );
        System.out.println ( "num2 == num3 =" + (num2 ==num3) );
        System.out.println ("num1 != num3 =" + (num1 != num3) );
    }

    public static void main(String[] args) {
        incrementOperator();
        System.out.println("");
        bitwiseOperator();
        System.out.println("");
        arithmeticOperator();
        System.out.println("");
        relationalOperator();
    }
}
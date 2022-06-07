package com.company;

public class PremitiveValues {

    static short Short;
    static int Intiger;
    static long Long;
    static float Float;
    static double Double;
    static char Char;
    static String String;
    static boolean Boolean;

    public void displayValues(){
        System.out.println("Defalut value of short is : " + Short);
        System.out.println("Defalut value of Intiger is : " + Intiger);
        System.out.println("Defalut value of Long is : " + Long);
        System.out.println("Defalut value of Float is : " + Float);
        System.out.println("Defalut value of Double is : " + Double);
        System.out.println("Defalut value of Char is : " + Char);
        System.out.println("Defalut value of String is : " + String);
        System.out.println("Defalut value of Boolean is : " + Boolean);
    }

    public static void main(String[] args) {
        PremitiveValues values = new PremitiveValues();
        values.displayValues();
    }
}

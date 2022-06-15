package com.company;

public class CallByValue {

    public static void callByValue(int a, int b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        callByValue(5,6);
    }
}

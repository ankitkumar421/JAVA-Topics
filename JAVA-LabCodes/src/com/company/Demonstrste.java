package com.company;

public class Demonstrste {

    static int a = 5;

    public static void displayStatic(){
        System.out.println(a);
    }

    static {
        System.out.println("It can used without main");
    }

    public static void main(String[] args) {
        System.out.println(a);
        displayStatic();
    }
}

package com.company;

import java.util.Scanner;

public class Milkman {

    public static double volume(double radius, double height){
        return 3.14*radius*radius*height;
    }

    public static double price(double radius, double height){
        double liters = volume(radius, height)/1000;
        return liters*40;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder : ");
        double radius = sc.nextDouble();
        System.out.println("Enter height of cylinder :");
        double height = sc.nextDouble();
        System.out.println("Volume of milk stored : "+price(radius, height));
    }
}

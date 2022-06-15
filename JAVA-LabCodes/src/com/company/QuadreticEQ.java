package com.company;

import java.util.Scanner;

public class QuadreticEQ {

    public static double calculateDeterminant(double a, double b, double c){
        double determinant;
        determinant = b * b - 4 * a * c;
        return determinant;
    }

    public static void calcRoot(double a, double b, double d){

        double root1;
        double root2;

        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        else if (d == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b and c to calculate quad eq");
        System.out.println("Enter value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter value of c : ");
        double c = sc.nextDouble();

        double d = calculateDeterminant(a,b,c);
        calcRoot(a, b, d);
    }
}

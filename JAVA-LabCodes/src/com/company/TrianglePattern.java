package com.company;

import java.util.Scanner;

public class TrianglePattern {

    static int column;
    static int row;

    public static void binaryTriangle(int rows){

        System.out.println("Binary Triangle");
        for(column = 1; column <= rows; column++){
            for(row=1; row<=column; row++){
                if(column % 2 == 1){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void reverseTriangle(int rows){

        System.out.println("Reverse Number");
        for (column = rows; column >= 1; column-- )
        {
            for(row = column; row <= rows; row++)
            {
                System.out.print(" "+row+" ");
            }
            System.out.println();
        }
    }

    public static void normalTriangle(int rows){

        System.out.println("Normal Pattern");
        for (column = 1; column <= rows; column++)
        {
            for (row = 1; row <= column; row++)
            {
                System.out.print(row+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        binaryTriangle(rows);
        reverseTriangle(rows);
        normalTriangle(rows);
    }
}

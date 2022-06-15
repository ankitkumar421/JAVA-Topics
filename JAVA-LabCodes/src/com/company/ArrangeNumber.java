package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumber {

    public static int[] arrangeArr(int[] arr){
        int temp = 0;
        int index1, index2;

        for (index1 = 0; index1 < arr.length; index1++) {
            for (index2 = index1+1; index2 < arr.length; index2++) {
                if(arr[index1] > arr[index2]) {
                    temp = arr[index1];
                    arr[index1] = arr[index2];
                    arr[index2] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to arrange ?");
        int input = sc.nextInt();

        int[] arr = new int[input];
        System.out.println("Enter the numbers : ");
        for (int initial = 0; initial < arr.length; initial++){
            arr[initial] = sc.nextInt();
        }

        int[] result = arrangeArr(arr);

        System.out.println(Arrays.toString(result));

    }
}

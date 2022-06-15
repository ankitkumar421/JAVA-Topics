package com.company;

public class OneDarray {

    public static void showArray(int size){
        int arr[];
        arr = new int[size];
        for (int value = 0; value < arr.length; value++){
            arr[value] = value ;
        }
        for (int value = 0; value < arr.length; value++){
            System.out.println("Value of arr["+value+"] "+" is "+arr[value]);
        }
    }

    public static void main(String[] args) {
        showArray(5);
    }
}

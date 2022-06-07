package com.company;

public class CompareString {

    // we can compare string also by using equals and  CompareTo()
    public void compareTwoString(String Str1, String Str2){
        if (Str1 == Str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        CompareString compareString = new CompareString();
        compareString.compareTwoString("Ankit", "Ankit");
    }
}

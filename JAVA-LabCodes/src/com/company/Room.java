package com.company;

import java.util.Scanner;

public class Room {

    int roomNo;
    String roomType;
    int roomArea;
    boolean acMachine;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roomtype: ");
        roomType = sc.nextLine();
        System.out.println("Enter roomno: ");
        roomNo = sc.nextInt();
        System.out.println("Area of room: ");
        roomArea = sc.nextInt();
        System.out.println("Is your room AC ?");
        acMachine = sc.nextBoolean();
    }

    public void displayData(){
        System.out.println("Room no is : " + roomNo);
        System.out.println("Roomtype is : " + roomType);
        System.out.println("Room Area is : " + roomArea);
        if (acMachine == true){
            System.out.println("Your room is AC");
        }else {
            System.out.println("Your room is non-AC");
        }
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.setData();
        room.displayData();
    }
}

package com.company;

public class Home extends Room{

    String homeType;
    int houseNo;

    public void setHomeData(){
        homeType = "Rent";
        houseNo = 420;
    }

    public void displayHomeData(){
        System.out.println(homeType);
        System.out.println(houseNo);
    }

    public static void main(String[] args) {
        Home home = new Home();
        home.setData();
        home.displayData();
        home.setHomeData();
        home.displayHomeData();
    }
}

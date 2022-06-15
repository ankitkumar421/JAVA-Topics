package com.company;

public class ThisKeyword {

    int x;

    public int displayKeyword(int x){
        this.x = x;
        return this.x;
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        System.out.println(thisKeyword.displayKeyword(5));
    }
}

package com.company;

abstract class RBI{
    abstract void getinterstrate();
}

class SBI extends RBI{
    public void getinterstrate(){
        System.out.println("8%");
    }
}

class Kotak extends RBI{
    public void getinterstrate(){
        System.out.println("7.5%");
    }
}

public class AbstractClassExample{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getinterstrate();

        Kotak kotak = new Kotak();
        kotak.getinterstrate();
    }
}

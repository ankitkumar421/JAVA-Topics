package com.company;

interface A1{
    void meth1();
    void meth2();
}

interface B1 extends A1{
    void meth3();
}

class MyClass implements B1{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }
}

public class CreateInterface {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();
    }
}

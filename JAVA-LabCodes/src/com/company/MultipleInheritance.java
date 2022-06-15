package com.company;

interface A2{
    void meth1(int a, int b);
}

interface B2{
    void meth2();
}

interface C2 extends A2, B2{
    void meth3();
}

class Declaration implements C2{
    @Override
    public void meth1(int a, int b) {
        System.out.println(a+b);
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

public class MultipleInheritance {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        C2 c2 = new Declaration();
        c2.meth1(a,b);
        c2.meth2();
        c2.meth3();
    }
}

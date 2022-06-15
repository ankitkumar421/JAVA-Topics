package com.company;

interface Drawable{
    void draw();
}

class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("drawing");
    }
}

class TestClass{
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.draw();

        Drawable drawable = new Rectangle();
        drawable.draw();
    }
}
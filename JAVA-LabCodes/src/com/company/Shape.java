package com.company;

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle draw");
    }
    public void erase(){
        System.out.println("Circle erase");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle draw");
    }
    public void erase(){
        System.out.println("Triangle erase");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("square draw");
    }
    public void erase(){
        System.out.println("square erase");
    }
}

public class Shape{
    public static void main(String[] args) {
       Circle circle = new Circle();
       circle.draw();
       circle.erase();

       Triangle triangle = new Triangle();
       triangle.draw();
       triangle.erase();

       Square square = new Square();
       square.draw();
       square.erase();
    }
}

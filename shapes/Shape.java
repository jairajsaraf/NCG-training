package com.example.training.shapes;

public abstract class Shape {
    abstract double area(int radius);
    abstract double circumference(int radius);
    abstract void set();
    abstract void print();
}

class Runner extends Circle{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.set();
        c.area(c.radius);
        c.circumference(c.radius);
        c.print();
    }
}


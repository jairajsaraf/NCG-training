package com.example.training.shapes;
import java.util.Scanner;

public class Circle extends Shape{
    int radius;
    double area(int radius){
        double area = 3.14 * this.radius * this.radius;
        return area;
    }

    double circumference(int radius){
        double circumference = 2 * 3.14 * this.radius;
        return circumference;
    }

    void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        this.radius = sc.nextInt();
    }

    void print(){
        System.out.println("Area of circle with radius " + this.radius + " is " + area(radius) + " and its circumference is " + circumference(radius));
    }
}

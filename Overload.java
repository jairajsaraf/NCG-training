package com.example.training;


public class Overload {
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static float add(float a, float b){
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(add(2.2f, 3.1f));
        System.out.println(add(2, 6));
        System.out.println(add(22, 37, 52));
    }
}

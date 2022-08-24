package com.example.training;

public class ConstOverload {
    String name = "Constructor Overloading";
    int number = 12;
    ConstOverload(){
        System.out.println("Creating new object.");
    }
    ConstOverload(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        ConstOverload c1 = new ConstOverload();
        ConstOverload c2 = new ConstOverload("Jairaj");

    }
}

package com.example.training;

public class ConstOverload {
    String name = "Constructor Overloading";
    int number = 12;
    ConstOverload(){
        this.name += " - has taken place";
    }
    ConstOverload(int number){
        this.number = number + 12;
    }

    public static void main(String[] args) {
        ConstOverload c1 = new ConstOverload();
        System.out.println(c1.name);
        ConstOverload c2 = new ConstOverload(12);
        System.out.println(c2.number);
    }
}

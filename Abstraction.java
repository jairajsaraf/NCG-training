package com.example.training;

abstract class Animal{
    public abstract void sound();
    public void eat(){
        System.out.println("Dog eats Pedigree.");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks.");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Dog pluto = new Dog();
        pluto.sound();
        pluto.eat();
    }
}

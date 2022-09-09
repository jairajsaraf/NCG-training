package com.example.training;

class Animal1 {

    public void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}
class Horse extends Animal1 {
    public void eat() {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }
}

public class Override{
    public static void main(String[] args){
        Animal1 h = new Horse();
        h.eat();
    }
}
package com.example.training;

class Dependent{
    Cohesion s = new Cohesion();
    public void read(){
        s.understand();
    }
}

public class Cohesion{
    public void understand(){
        System.out.println("Tightly coupled.");
    }
}

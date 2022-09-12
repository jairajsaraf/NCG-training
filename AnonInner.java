package com.example.training;

public class AnonInner {
    public void car(){
        System.out.println("Outer car");
    }
}

class AnonOuter{
    AnonInner ai = new AnonInner(){
        public void car(){
            System.out.println("Inner car");
        }
        public void bike(){
            System.out.println("Inner bike");
        }
    };
}

class RunIt{
    public static void main(String[] args) {
        AnonOuter ao = new AnonOuter();
        ao.ai.car();
        
    }
}

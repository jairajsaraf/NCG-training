package com.example.training;
//Tightly coupled classes
class Volume{
    public static void main(String[] args){
        Box b = new Box(5, 5, 5);
        System.out.println(b.volume);
    }
}

class Box{
    public int volume;
    Box(int length, int breadth, int width){
        this.volume = length * breadth * width;
    }
}

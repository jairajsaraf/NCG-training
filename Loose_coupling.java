package com.example.training;

class Volume1
{
    public static void main(String args[])
    {
        Box1 b = new Box1(5,5,5);
        System.out.println(b.getVolume());
    }
}
final class Box1
{
    private int volume;
    Box1(int length, int width, int height)
    {
        this.volume = length * width * height;
    }
    public int getVolume()
    {
        return volume;
    }
}